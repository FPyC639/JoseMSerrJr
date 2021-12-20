elemental function func(i) result(j)
    real, intent(in) :: i ! input
    real :: j ! output
    j = sin(i)
end function func
program derivative_tutorial
implicit none
interface
    elemental function func(i) result(j)
        real, intent(in) :: i ! input
        real  :: j ! output
    end function func
end interface
integer, parameter :: n = 100
real, dimension(0:n)  :: x,y,x_0, y_1, y_0,derivative_f, delta, deltax, dx1
real :: x_start = 0, x_end = 20, dx, j
integer :: i
character(len=25) :: input_file, input_file1
dx = (x_end-x_start)/n
x = [(i*dx,i=0,n)]
y = sin(x)
delta = .0001 * x
deltax = x+delta
dx1 =deltax -x
y_1 = func(deltax)
y_0= func(x)
derivative_f = (y_1-y_0)/dx1
read(*,*) input_file
open(unit=1, file=input_file)
do i=1, n 
    write(1,*)  x(i), ' ' ,derivative_f(i)
end do
read(*,*) input_file1
open(unit=1, file=input_file1)
do i=1, n
    write(1,*) x(i),' ', y(i)
end do
end program derivative_tutorial