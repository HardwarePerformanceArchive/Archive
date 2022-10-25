from os \
    import walk

from os.path \
    import isfile, join


def TravelAndListFiles( in_path ):
    list = []

    for root, dirs, files in walk(in_path):
        for file in files:
            full_path = join(root, file)
            
            if isfile(full_path):
                list.append(full_path) 

    return list
