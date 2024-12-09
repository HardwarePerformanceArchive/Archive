# Hardware Performance Archive
[![DOI][ZENADO_BADGE]][ZENADO_DOI]

![Repository cover image for social networks][Cover_Image]

This repository contains data that are recorded hardware performance. The raw data is saved in CSV
fileformat and is located in the dataset directory.

The release of the latest version can be found and downloaded at [Kaggle][KAGGLE_DATASET_LOCATION]. 
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
    * CSV
    * TSV
    * JSON
    * XML

* ***Code***
    * [MySQL][MYSQL_URL]
    * [PostgreSQL][POSTGRESQL_URL]

Currently also working on having the data sorted & filtered by Year. 
Together with making branches for it.

## Appendices
* Author: [Kent vejrup Madsen][CURRENT_ACCOUNT][^5]
* Contact: Kent.vejrup.madsen@designermadsen.dk
* Changelog: [Changes][CHANGELOG_LOCATION]
* [Download][DOWNLOAD_AT_DOCUMENT]
* Copyright 2018 - 2024 [Kent vejrup Madsen][CURRENT_ACCOUNT]
    * Licenses
        * [MIT - Source Code License][MIT_License]
        * [Dataset License - Attribution 4.0 International][ATT4INT_License]
* Citations
    * [Kaggle](./citations_kaggle.md)
    * [Zenodo](./citations_zenodo.md)

### Document
* Created at: 29-01-2020[^4]
* Updated at: 09-12-2024



## Foot Notes
[^4]: Original creation date of the [repository][OLD_REPOSITORY] is at: 31-01-2019 by [Kent Madsen][PREVIOUS_ACCOUNT]. 
[^5]: Keep in mind that this repository is a fork of the repository [Private-Data-Performance][OLD_REPOSITORY], as I lost access to my previous [account][PREVIOUS_ACCOUNT].

<!-- Shortcuts -->
[MYSQL_URL]: https://www.mysql.com/
[POSTGRESQL_URL]: https://www.postgresql.org/

[Cover_Image]: .github/covers/800x600.jpg

[MIT_License]: License.md
[ATT4INT_License]: License.md  

[OLD_REPOSITORY]: https://github.com/KentMadsen/Private-Data-Performance

[PREVIOUS_ACCOUNT]: https://github.com/KentMadsen
[CURRENT_ACCOUNT]: https://github.com/KentVejrupMadsen

<!-- Documents -->
[CHANGELOG_LOCATION]: changelog.md
[DOWNLOAD_AT_DOCUMENT]: download.md

<!-- Kaggle -->
[KAGGLE_DATASET_LOCATION]: https://doi.org/10.34740/kaggle/dsv/10092247

<!-- Software -->
[DOWNLOAD_OPENHARDWARE_MONITOR]: https://openhardwaremonitor.org/downloads/
[DOWNLOAD_LIBRE_HARDWARE_MONITOR]: https://github.com/LibreHardwareMonitor/LibreHardwareMonitor/releases/tag/v0.9.3

[OPENHARDWARE_MONITOR_GITHUB]: https://github.com/openhardwaremonitor/openhardwaremonitor
[LIBRE_HARDWARE_MONITOR_GITHUB]: https://github.com/LibreHardwareMonitor/LibreHardwareMonitor



<!-- Badges -->
[ZENADO_DOI]: https://doi.org/10.5281/zenodo.14028503
[ZENADO_BADGE]: https://zenodo.org/badge/237001402.svg