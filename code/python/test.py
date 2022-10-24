import csv


path = '''D:\\workspace\\data\\private\\all\\dataset\\csv\\openhardwaremonitor\\laptops\\asus\\gl553vd\\2020\\02\\23.csv'''

columns = 0
rows = 1

index = []

def index_row(column, idx):
    global index
    
    pass


def iterate_row(rows):
    global columns

    for idx in range(0, columns, 1):
        currentVariable = rows[idx]

        index_row(currentVariable, idx)


def main():
    global path, columns, rows, index

    with open(path, newline='\r\n') as csv_file:
        reader = csv.reader(csv_file, delimiter=',', quotechar='\"')

        for row in reader:
            if columns == 0:
                columns = len(row)
            
            iterate_row(row)

            rows = rows + 1

    
    print('columns:', int(columns))
    print('rows:', int(rows))





if __name__ == '__main__':
    main()