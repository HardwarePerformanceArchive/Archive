import os
from os import path

# Finds the root of a child directory.
class ParentRoot:
    def __init__(self, name, childPath):
        self.name = name
        self.child = childPath

        self.iteration = 0

    def execute(self):
        current_path = self.child
        r = self.lookup(current_path)
        return r

    def lookup(self, current):
        if self.increment() == 4:
            return None

        parent = os.path.join(current, os.pardir)
        ParentPath = path.abspath(parent)

        if path.basename(ParentPath) == self.name:
            return ParentPath
        else:
            return self.lookup(parent)


    def increment(self):
        self.iteration = self.iteration + 1
        return self.iteration
