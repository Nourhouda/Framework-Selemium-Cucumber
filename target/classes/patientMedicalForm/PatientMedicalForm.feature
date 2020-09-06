@patientMedicalForm
Feature: Fill the form - PatientMedical
  I want to fill the form

  @form
  Scenario: Fill the form - PatientMedical
    Given open application medical
    When set first name
    And set last name
    And click submit button

