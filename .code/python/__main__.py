import traverse
import parent
import os

def main():
    p = parent.ParentRoot( 'all', os.getcwd() )
    
    print(p.execute())

    
    

if __name__ == '__main__':
    main()