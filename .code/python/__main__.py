import parent
import archive

import os


def main():
    p = parent.ParentRoot( 'all', os.getcwd() )
    rp = p.execute()
    orgArchive = rp + '\\dataset\\csv\\openhardwaremonitor'

    arc = archive.Archive(orgArchive)



    
    

if __name__ == '__main__':
    main()