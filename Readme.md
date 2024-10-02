# Hardware Performance Archive
![Repository cover image for social networks][Cover_Image]

This repository contains data that are recorded hardware performance. The raw data is saved in CSV[^7] 
fileformat and is located in the dataset directory.

The release of the latest version can be found and downloaded at 
[Kaggle][KAGGLE_DATASET_LOCATION]. 
You're welcome to experiement with it in 'notebooks' and etc.


## Overview
* Go to content description At [this location][CONTENT_LOCATION].
* Current Version at: V1.0.7
* Size of dataset directory: 29.9 GB
    * Dataset
        * Encoding of files in dataset directory: US-ASCII
        * First record at: 2018-09-17
        * Last record at: 2024-10-01
        * Dataset Record File format: CSV[^7]

    * Formatted: None


### Total size of the dataset
* Datasets total size is: ( **29.9** GB )
    * dataset directory: 29.9 GB
        * CSV[^7]
        
    * formats directory: 0.0 GB
        * JSON[^4] directory: 0.0 GB
        * XML[^5] Directory : 0.0 GB
        * TSV[^6] Directory : 0.0 GB


### Tools
Tools used by the repository and where to find them.

#### Defaults
* Logger:
    * [Libre Hardware Monitor][LIBRE_HARDWARE_MONITOR_GITHUB]

#### Logging Tools
* Files logged with: 
    * (2024 - ?) [LibreHardwareMonitor][DOWNLOAD_LIBRE_HARDWARE_MONITOR], It's repository on [Github][LIBRE_HARDWARE_MONITOR_GITHUB]
    * (2018 - 2024) [OpenHardwareMonitor][DOWNLOAD_OPENHARDWARE_MONITOR], it's repository on [Github][OPENHARDWARE_MONITOR_GITHUB]



### Support
Currently this repository only has support for CSV[^7] files. 
I am currently working on a solution. To have the files reformatted into other formats like JSON[^4], XML[^5] and TSV[^6].

Currently in development
* ***Formats***
    * JSON[^4]
    * XML[^5]
    * TSV[^6]


* ***Code***
    * [MySQL][MYSQL_URL]
    * [PostgreSQL][POSTGRESQL_URL]


Currently also working on having the data sorted & filtered by Year. together with making branches for it.

### Download At
* [Kaggle][KAGGLE_DATASET_LOCATION] a place to download datasets and to play with data. Which can be though a python terminal or their website.

* [Web Archive][WEBARCHIVE_DATASET_LOCATION]
    * [ZIP][WEBARCHIVE_DATASET_ZIP]
        * [CONTENT][WEBARCHIVE_DATASET_ZIP_CONTENT]

    * [TAR.GZ][WEBARCHIVE_DATASET_TAR_GZ]

* [Onedrive][ONEDRIVE_LOCATION]
    * [ZIP](https://1drv.ms/u/s!AnVSo6qhoQp5j8RjDo0Z3ozNKr9xXQ?e=H3qbAm)[^2], 
    * [TAR.GZ](https://1drv.ms/u/s!AnVSo6qhoQp5j8RkosdL1iV1cWcG2g?e=ReCjNt)[^3]

* [Github][GITHUB_DATASET_RELEASE_LOCATION]
    * [ZIP][GITHUB_DATASET_LOCATION_ZIP] [^1] [^2]
    * [TAR.GZ][GITHUB_DATASET_LOCATION_TAR_GZ] [^1] [^3]


## Appendices
* Keep in mind that this repository is a fork of the repository [Private-Data-Performance][OLD_REPOSITORY], 
at my previous [account][PREVIOUS_ACCOUNT] as i have lost access to it.
* Author: [Kent vejrup Madsen][CURRENT_ACCOUNT]
* Contact: Kent.vejrup.madsen@designermadsen.dk
* Changelog: [Changes][CHANGELOG_LOCATION]
* Copyright 2018 - 2024 [Kent vejrup Madsen][CURRENT_ACCOUNT]
    * Licenses
        * [MIT - Source Code License][MIT_License]
        * [Dataset License - Attribution 4.0 International][ATT4INT_License]



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
* Original creation date is at: [31-01-2019][OLD_REPOSITORY], [Kent Madsen][PREVIOUS_ACCOUNT]
* Created at: 29-01-2020
* Updated at: 02-10-2024


## Foot Notes
[^1]: sha256sum ./filepath.txt

[^2]: sha256 hash checksum for zip 8567f124aadb59688785130c8d9602de1e809621e74bf582711c8ec2007ff15a

[^3]: sha256 hash checksum for tar.gz 4682b2df535bd0ef7b0b3276cd4fb57f4a05d2a761aa3a50abeaf87b161f614f

[^4]: JavaScript Object Notation

[^5]: eXtensible Markup Language

[^6]: Tab-seperated values

[^7]: Comma-seperated values

<!-- Shortcuts -->
[MYSQL_URL]: https://www.mysql.com/
[POSTGRESQL_URL]: https://www.postgresql.org/

[Cover_Image]: docs/resources/covers/800x600.jpg

[MIT_License]: License.md
[ATT4INT_License]: License.md  

[OLD_REPOSITORY]: https://github.com/KentMadsen/Private-Data-Performance

<!-- Donwload Dataset Shortcut -->
[KAGGLE_DATASET_LOCATION]: https://www.kaggle.com/datasets/kentvejrupmadsen/dataset-performance

[WEBARCHIVE_DATASET_LOCATION]: https://archive.org/download/data.private.performance-release-06-09-2022
[WEBARCHIVE_DATASET_ZIP]: https://archive.org/download/hardware-performance-archive-12.01.2024/Archive-release-12.01.2024-1.fix.zip
[WEBARCHIVE_DATASET_ZIP_CONTENT]: https://ia601207.us.archive.org/view_archive.php?archive=/13/items/hardware-performance-archive-12.01.2024/Archive-release-12.01.2024-1.fix.zip

[WEBARCHIVE_DATASET_TAR_GZ]: https://archive.org/download/hardware-performance-archive-12.01.2024/Archive-release-12.01.2024-1.fix.tar.gz

[GITHUB_DATASET_RELEASE_LOCATION]: https://github.com/Hardware-Performance-Archive/Archive/releases/tag/release-12.01.2024-1.fix
[GITHUB_DATASET_LOCATION_TAR_GZ]: https://github.com/Hardware-Performance-Archive/Archive/archive/refs/tags/release-12.01.2024-1.fix.tar.gz
[GITHUB_DATASET_LOCATION_ZIP]: https://github.com/Hardware-Performance-Archive/Archive/archive/refs/tags/release-12.01.2024-1.fix.zip

[ONEDRIVE_LOCATION]: https://1drv.ms/f/s!AnVSo6qhoQp5laYABj5zKFwyrllctg?e=osZ0ag
[ONEDRIVE_ZIP_LOCATION]: 
[ONEDRIVE_TAR_GZ_LOCATION]: 


[PREVIOUS_ACCOUNT]: https://github.com/KentMadsen
[CURRENT_ACCOUNT]: https://github.com/KentVejrupMadsen

[CHANGELOG_LOCATION]: docs/changelog.md
[CONTENT_LOCATION]: docs/contents.md

[DOWNLOAD_OPENHARDWARE_MONITOR]: https://openhardwaremonitor.org/downloads/
[DOWNLOAD_LIBRE_HARDWARE_MONITOR]: https://github.com/LibreHardwareMonitor/LibreHardwareMonitor/releases/tag/v0.9.3

[OPENHARDWARE_MONITOR_GITHUB]: https://github.com/openhardwaremonitor/openhardwaremonitor
[LIBRE_HARDWARE_MONITOR_GITHUB]: https://github.com/LibreHardwareMonitor/LibreHardwareMonitor