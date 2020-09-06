@patientMedicalForm
Feature: Fill the form - PatientMedical
  I want to fill in the patient from

  @form
  Scenario: Fill the form - PatientMedical
    Given open application medical
    When set first name
    And set last name
    And click submit button

