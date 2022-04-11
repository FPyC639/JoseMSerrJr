    .data
prompt:    .asciiz    "Please enter the first integer: "
message: 	.asciiz "\nPlease the enter integers you wish to add: "
terminator: 	.asciiz "\n Please enter stop key of 0"
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
    li $s2, 0
    add $s2,$s0, $s2
loop:   
    li $v0, 4
    la $a0, message
    syscall
    li $v0, 5
    syscall
    move $s0, $v0
    add $s2, $s0, $s2
    li $v0, 4
    la $a0, terminator
    syscall
    li $v0, 5
    syscall
    move $s3, $v0
    bne  $s3, 0, loop
    exit: move $a0, $s2
    li $v0, 4
    la $a0, output
    syscall
    move $a0, $s2
    li $v0, 1
    syscall
    li  $v0, 10 
    syscall