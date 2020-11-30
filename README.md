# performance test \EXUI\>

This is repository for   common performance test framework. for every project we need to add the following steps for the individual project.
- Step1: download the common framework from the repository
- Step2: add all the source files under src/gatling simulations directory.
- Step3: under src/gatling/simulations following is the folder structure we need to add the files
uk/gov/hmcts/cmc/performance(here cmc can be replaced by relavant project name like sscs, sidam,probate etc)
- Step4: under uk/gov/hmcts/cmc/performance/utils add one file called Environment.scala file 
- Step5: add the AAT urls within the Environment.scala
- Step6: add data files in the following locations
src/gatling/data and srs/test/resources/data
- Step7: add bodies files in the following locations
src/gatling/bodies and srs/test/resources/bodies
- Step8: Run the simulation using srs/gatling/simulations/Run...
- Step9: open the jenkinsfile_nightly and update the following code with project specific urls 
 string(name: 'URL_TO_TEST', defaultValue: 'https://div-pfe-aat.service.core-compute-aat.internal', description: 'The URL you want to run these tests against'),
                string(name: 'IDAM_URL', defaultValue: 'https://preprod-idamapi.reform.hmcts.net:3511', description: 'The IDAM API Url to create and delete users from'),
                string(name: 'IDAM_WEB_URL', defaultValue: 'https://idam.preprod.ccidam.reform.hmcts.net', description: 'The IDAM Loging Url')
 
 def product = "project name"(change the project component like sscs,probate,sidam etc)

                
