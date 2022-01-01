# Java challenge

Problem:

The basic sales tax is 10% on all goods, except books,
foodstuffs and medical products, which are exempt from tax. The import duty is an additional
sales tax
levied on all imported goods at a rate of 5% and for which there are no exemptions. When I
buy, I receive a receipt that lists all the items and their price
the price (including taxes) and finally the total cost of the items,
and the total amount of sales tax paid. The rounding rules for sales tax
state that if the tax rate is n%, a shelf price of p (np/100 rounded up
rounded up to the nearest 0.05) is VAT.

Input I
1 book at 12.49
1 music CD at 14.99
1 chocolate bar at 0.85

Input II:
1 imported box of chocolates at 10.00
1 imported bottle of perfume at 47.50

Input III:
1 imported bottle of perfume at 27.99
1 bottle of perfume at 18.99
1 packet of headache pills at 9.75
1 box of imported chocolates at 11.25

Output I:
1 book: 12.49
1 music CD: 16.49
1 chocolate bar: 0.85
Sales Taxes: 1.50
Total: 29.83

Output II:
1 imported box of chocolates: 10.50
1 imported bottle of perfume: 54.65
Sales Taxes: 7.65
Total: 65.15

Output III:
1 imported bottle of perfume: 32.19
1 bottle of perfume: 20.89
1 packet of headache pills: 9.75
1 imported box of chocolates: 11.85
Sales Taxes: 6.70
Total: 74.68

