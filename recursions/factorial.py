"""
    Factorial of a number n is defined as -> n!

    where n! = n(n - 1)(n - 2).....(1)

    For positive integers of n
"""

number = int(input("Enter a positive integer n:\n"))


def factorial(n: int) -> int:
    """
        Takes a positive integer n and returns its factorial
    """

    if n == 1:
        return n
    elif n < 0:
        return "Please enter a positive integer"
    else:
        return n * factorial(n - 1)


print(f"The factorial of {number} is {factorial(number)}")
