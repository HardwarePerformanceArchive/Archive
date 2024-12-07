# Hardware Performance Archive
[![DOI][ZENADO_BADGE]][ZENADO_DOI]

![Repository cover image for social networks][Cover_Image]

This repository contains data that are recorded hardware performance. The raw data is saved in CSV
fileformat and is located in the dataset directory.

The release of the latest version can be found and downloaded at 
[Kaggle][KAGGLE_DATASET_LOCATION]. 
You're welcome to experiement with it in 'notebooks' and etc.


## Overview
* Current Version at: V1.0.9
* Size of dataset directory: 34.1 GB
    * Dataset
        * Encoding of files in dataset directory: US-ASCII
        * First record at: 2018-09-17
        * Last record at: 2024-12-01
        * Dataset Record File format: CSV

    * Formatted: None


### Total size of the dataset

| Format                | Size         | Measurement  |
| --------------------- | ------------ | ------------ |
| **All**               | **34.1**     | **GB**       |
| Dataset directory     | 34.1         | GB           |
| Exports directory     | 0.0          | GB           |

#### by Exports

| Format       | Size         | Measurement  |
| ------------ | ------------ | ------------ |
| **All**      | **0.0**      | **None**     |
| CSV          | 0.0          | None         |
| TSV          | 0.0          | None         |
| XML          | 0.0          | None         |
| JSON         | 0.0          | None         |


### Tools
Tools used by the repository and where to find them.

#### Defaults
* Logger:
    * [Libre Hardware Monitor][LIBRE_HARDWARE_MONITOR_GITHUB]

#### Logging Tools
* Files logged with: 
    * (2024 - ?) [LibreHardwareMonitor][DOWNLOAD_LIBRE_HARDWARE_MONITOR], the repository can be found on [Github][LIBRE_HARDWARE_MONITOR_GITHUB]
    * (2018 - 2024) [OpenHardwareMonitor][DOWNLOAD_OPENHARDWARE_MONITOR], the repository can be found on [Github][OPENHARDWARE_MONITOR_GITHUB]



### Support
Currently this repository only has support for CSV files. 
I am currently working on a solution. 
To have the files reformatted into other formats like JSON, XML and TSV.

Currently in development
* ***Formats***
    * JSON
    * XML
    * TSV


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
* Author: [Kent vejrup Madsen][CURRENT_ACCOUNT][^5]
* Contact: Kent.vejrup.madsen@designermadsen.dk
* Changelog: [Changes][CHANGELOG_LOCATION]
* Copyright 2018 - 2024 [Kent vejrup Madsen][CURRENT_ACCOUNT]
    * Licenses
        * [MIT - Source Code License][MIT_License]
        * [Dataset License - Attribution 4.0 International][ATT4INT_License]



### Citation
    **DOI**        
        10.34740/kaggle/dsv/10092247
    
    **APA**

        Kent vejrup Madsen. (2024). 
        Hardware Performance Data [Data set]. 
        Kaggle. 
        https://doi.org/10.34740/KAGGLE/DSV/10092247

    **BibTeX**

        @misc{
            kent_vejrup_madsen_2024,
            title       = {Hardware Performance Data},
            url         = {https://www.kaggle.com/dsv/10092247},
            DOI         = {10.34740/KAGGLE/DSV/10092247},
            publisher   = {Kaggle},
            author      = {Kent vejrup Madsen},
            year        = {2024}
        }


### Document
* Created at: 29-01-2020[^4]
* Updated at: 07-12-2024



## Foot Notes
[^1]: sha256sum ./filepath.example_file_extension

[^2]: sha256 hash checksum for zip bf47c81665dc45d513b8e1d393c04695e3978eb14b1ef39e61039335a62de9ab
[^3]: sha256 hash checksum for tar.gz c942b748435874a28e9326190a4481256087853167eddd58f34a199d2a69c704
[^4]: Original creation date of the [repository][OLD_REPOSITORY] is at: 31-01-2019 by [Kent Madsen][PREVIOUS_ACCOUNT]. 
[^5]: Keep in mind that this repository is a fork of the repository [Private-Data-Performance][OLD_REPOSITORY], as I lost access to my previous [account][PREVIOUS_ACCOUNT].

<!-- Shortcuts -->
[MYSQL_URL]: https://www.mysql.com/
[POSTGRESQL_URL]: https://www.postgresql.org/

[Cover_Image]: .github/covers/800x600.jpg

[MIT_License]: License.md
[ATT4INT_License]: License.md  

[OLD_REPOSITORY]: https://github.com/KentMadsen/Private-Data-Performance


<!-- Donwload Dataset Shortcut -->
[KAGGLE_DATASET_LOCATION]: https://www.kaggle.com/datasets/kentvejrupmadsen/dataset-performance

[WEBARCHIVE_DATASET_LOCATION]: https://archive.org/details/HPA-Version-1.0.7

[WEBARCHIVE_DATASET_ZIP]: https://archive.org/download/HPA-Version-1.0.7/Archive-release-02-10-2024.zip
[WEBARCHIVE_DATASET_ZIP_CONTENT]: https://archive.org/download/HPA-Version-1.0.7/Archive-release-02-10-2024.zip/
[WEBARCHIVE_DATASET_TAR_GZ]: https://archive.org/download/HPA-Version-1.0.7/Archive-release-02-10-2024.tar.gz



[GITHUB_DATASET_RELEASE_LOCATION]: https://github.com/HardwarePerformanceArchive/Archive/releases/tag/release-02-10-2024
[GITHUB_DATASET_LOCATION_ZIP]: https://github.com/HardwarePerformanceArchive/Archive/archive/refs/tags/release-02-10-2024.zip
[GITHUB_DATASET_LOCATION_TAR_GZ]: https://github.com/HardwarePerformanceArchive/Archive/archive/refs/tags/release-02-10-2024.tar.gz



[ONEDRIVE_LOCATION]: https://1drv.ms/f/s!AnVSo6qhoQp5nsIYWtqU9wcmh2KVxw?e=L9x5en
[ONEDRIVE_ZIP_LOCATION]: https://1drv.ms/u/s!AnVSo6qhoQp5nsIZKxU2vO6eaGoW7g?e=iO8jJW
[ONEDRIVE_TAR_GZ_LOCATION]: https://1drv.ms/u/s!AnVSo6qhoQp5nsIaMP4qRe3LlNyfAg?e=tcVQYZ



[PREVIOUS_ACCOUNT]: https://github.com/KentMadsen
[CURRENT_ACCOUNT]: https://github.com/KentVejrupMadsen


[CHANGELOG_LOCATION]: changelog.md


[DOWNLOAD_OPENHARDWARE_MONITOR]: https://openhardwaremonitor.org/downloads/
[DOWNLOAD_LIBRE_HARDWARE_MONITOR]: https://github.com/LibreHardwareMonitor/LibreHardwareMonitor/releases/tag/v0.9.3


[OPENHARDWARE_MONITOR_GITHUB]: https://github.com/openhardwaremonitor/openhardwaremonitor
[LIBRE_HARDWARE_MONITOR_GITHUB]: https://github.com/LibreHardwareMonitor/LibreHardwareMonitor


[ZENADO_DOI]: https://doi.org/10.5281/zenodo.14028503
[ZENADO_BADGE]: https://zenodo.org/badge/237001402.svg