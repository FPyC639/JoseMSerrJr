    .data
prompt:    .asciiz    "Please enter the aSide: "
prompt1: 	.asciiz "\nPlease enter the bSide: "
prompt2: .asciiz "\nPlease enter the cSide: "
output:    .asciiz    "\n The volume of the shape is:  "
output1: .asciiz "\n The surface area of the shape is: "
    .globl main
    .text
main:
    li $v0, 4
    la $a0, prompt
    syscall
    li $v0, 5
    syscall
    move $s0, $v0
    li $v0, 4
    la $a0, prompt1
    syscall
    li $v0, 5
    syscall
    move $s1, $v0
    li $v0, 4
    la $a0, prompt2
    syscall
    li $v0, 5
    syscall
    move $s2, $v0
    mul $t1, $s0, $s1
    mul $t0, $t1, $s2
    li $v0, 4
    la $a0, output
    syscall
    move $a0, $t0
    li $v0, 1
    syscall
    mul $t0, $s0, $s2
    add $t0, $t0, $t1
    mul $t1, $s1, $s2
    add $t0, $t0, $t1
    mul $t0, $t0, 2
    li $v0, 4
    la $a0, output1
    syscall
    move $a0, $t0
    li $v0, 1
    syscall
    li  $v0, 10 
    syscall
