    .data
prompt:    .asciiz    "Please enter the first integer: "
message: 	.asciiz "\nPlease enter the second integer: "
output:    .asciiz    "\n The summation of the numbers is:  "
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
    la $a0, message
    syscall
    li $v0, 5
    syscall
    move $s1, $v0
    add $s2, $s1, $s0
    move $a0, $s2
    li $v0, 4
    la $a0, output
    syscall
    move $a0, $s2
    li $v0, 1
    syscall
    li  $v0, 10 
    syscall
