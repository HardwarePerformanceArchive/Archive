import os
from os.path import join


def TravelAndListFiles( path ):
    list = []

    for root, dirs, files in os.walk(path):
        for file in files:
            full_path = join(root, file)
            list.append(full_path)

    return list
