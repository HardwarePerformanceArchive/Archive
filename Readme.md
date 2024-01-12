# Hardware Performance Archive
![Repository cover image for social networks](docs/resources/3.jpg)

This repository contains data that are recorded hardware performance. The raw data is saved in CSV[^7] 
fileformat and is located in the dataset directory.

The release of the latest version can be found and downloaded at 
[Kaggle](https://www.kaggle.com/datasets/kentvejrupmadsen/dataset-performance). 
You're welcome to experiement with it in 'notebooks' and etc.


## Overview
* Go to content description At [this location](docs/contents.md).
* Current Version at: V1.0.6
* Size of dataset directory: 16.7 GB
    * Dataset
        * Encoding of files in dataset directory: US-ASCII
        * First record at: 2018-09-17
        * Last record at: 2024-01-06
        * Dataset Record File format: CSV[^7]

    * Formatted: None


### Total size of the dataset
* Datasets total size is: ( **16.7** GB )
    * dataset directory: 16.7 GB
        * CSV[^7]
        
    * formats directory: 0.0 GB
        * JSON[^4] directory: 0.0 GB
        * XML[^5] Directory : 0.0 GB
        * TSV[^6] Directory : 0.0 GB


### Tools
* Files logged with 
[OpenHardwareMonitor it can be downloaded here](https://openhardwaremonitor.org/downloads/), 
it's repository is at: [on github](https://github.com/openhardwaremonitor/openhardwaremonitor)



### Support
Currently this repository only has support for CSV[^7] files. I am currently working on a solution. To have the files reformatted into other formats like JSON[^4], XML[^5] and TSV[^6].

Currently in development
* ***Formats***
    * JSON[^4]
    * XML[^5]
    * TSV[^6]


* ***Code***
    * [MySQL](https://www.mysql.com/)
    * [PostgreSQL](https://www.postgresql.org/)


Currently also working on having the data sorted & filtered by Year. together with making branches for it.

### Download & Others
* [Kaggle](https://www.kaggle.com/datasets/kentvejrupmadsen/dataset-performance) 
a place to download datasets and to play with data. Which can be though a python terminal or their website.
* [Web Archive](https://archive.org/download/data.private.performance-release-06-09-2022)

* Onedrive
    * [Zip](https://1drv.ms/u/s!AnVSo6qhoQp5j8RjDo0Z3ozNKr9xXQ?e=H3qbAm)[^2], 
    * [Tar.gz](https://1drv.ms/u/s!AnVSo6qhoQp5j8RkosdL1iV1cWcG2g?e=ReCjNt)[^3]

* [Github]([Github](https://github.com/KentVejrupMadsen/data.performance/releases/tag/release-03-08-2022)) 
    * [as a zip file](https://github.com/KentVejrupMadsen/data.private.performance/archive/refs/tags/release-06-09-2022.zip) [^1] [^2]
    * [as tar.gz](https://github.com/KentVejrupMadsen/data.private.performance/archive/refs/tags/release-06-09-2022.tar.gz) [^1] [^3]


## Appendices
* Keep in mind that this repository is a fork of the repository 
[Private-Data-Performance](https://github.com/KentMadsen/Private-Data-Performance/commits/master), 
at my previous [account](https://github.com/KentMadsen) 
as i have lost access to it.
* Author - [Kent vejrup Madsen](https://github.com/KentVejrupMadsen)
* Contact: Kent.vejrup.madsen@designermadsen.dk
* Changelog: [Changes](docs/changelog.md)
* Copyright 2022 [Kent vejrup Madsen](https://github.com/KentVejrupMadsen)
    * Licenses
        * [MIT - Source Code License](docs/licenses/sourcecode_license.md)
        * [Dataset License - Attribution 4.0 International](docs/licenses/dataset_license.md)



### Citation
- **DOI**, 10.34740/kaggle/ds/2360009
    
     **APA**

          Kent vejrup Madsen. (2022).
          <i>Performance Data</i>
          [Data set]. Kaggle. https://doi.org/10.34740/KAGGLE/DS/2360009

    **BibTeX**

          @misc{
            kent vejrup madsen_2022,
            title={Performance Data},
            url={https://www.kaggle.com/ds/2360009},
            DOI={10.34740/KAGGLE/DS/2360009},
            publisher={Kaggle},
            author={Kent vejrup Madsen},
            year={2022} }


### Document
* Original creation date is at: [31-01-2019](https://github.com/KentMadsen/Private-Data-Performance), Kent Madsen
* Created at: 29-01-2020
* Updated at: 02-11-2022


## Foot Notes
[^1]: sha256sum ./filepath.txt

[^2]: sha256 hash checksum for zip 8567f124aadb59688785130c8d9602de1e809621e74bf582711c8ec2007ff15a

[^3]: sha256 hash checksum for tar.gz 4682b2df535bd0ef7b0b3276cd4fb57f4a05d2a761aa3a50abeaf87b161f614f

[^4]: JavaScript Object Notation

[^5]: eXtensible Markup Language

[^6]: Tab-seperated values

[^7]: Comma-seperated values