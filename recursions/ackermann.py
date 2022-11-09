"""
    Ackermann function is a recursive that is defined as:

    A(m, n) = {
        n + 1 if m = 0;
        A(m - 1, 1) If m > 0 and n = 0;
        A(m - 1, A(m, n - 1)) If m > 0 and n > 0
    }

    - The function grows and terminates
    - It takes only positive arguments
"""

em = int(input("Enter m:\n"))
en = int(input("Enter n:\n"))


def ackermann_function(m: int, n: int) -> int:
    """
        Takes two arguments m and n and returns the value using Ackermann function
    """

    if m == 0:
        return n + 1
    elif (m > 0) and (n == 0):
        return ackermann_function(m - 1, 1)
    elif (m > 0) and (n > 0):
        return ackermann_function(m - 1, ackermann_function(m, n - 1))
    else:
        print("Please enter positive numbers only")


print(f"The value is {ackermann_function(em, en)}")
