package com.djzass.mediapp.mediapp;

import android.provider.BaseColumns;

public class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static abstract class AccountEntry implements BaseColumns {
        public static final String TABLE_NAME = "account";
        public static final String COLUMN_NAME_ACCOUNT_ID = "accountId";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_NRIC = "nric";
        public static final String COLUMN_NAME_EMAIL = "email";
        public static final String COLUMN_NAME_CONTACTNO = "contactNo";
        public static final String COLUMN_NAME_ADDRESS = "address";
        public static final String COLUMN_NAME_DOB = "dob";
        public static final String COLUMN_NAME_GENDER = "gender";
        public static final String COLUMN_NAME_MARITAL_STATUS = "maritalStatus";
        public static final String COLUMN_NAME_CITIZENSHIP = "citizenship";
        public static final String COLUMN_NAME_COUNTRY_OF_RESIDENCE = "countryOfResidence";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String COLUMN_NAME_PASSWORD = "password";
    }
    public static abstract class CountryEntry implements BaseColumns{
        public static final String TABLE_NAME = "country";
        public static final String COLUMN_NAME_COUNTRY_ID = "countryId";
        public static final String COLUMN_NAME_COUNTRY_NAME = "countryCountry";
    }

    public static abstract class AppointmentEntry implements BaseColumns {
        public static final String TABLE_NAME = "appointment";
        public static final String COLUMN_NAME_APPOINTMENT_ID = "appoinmentId";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
        public static final String COLUMN_NAME_CLINIC_ID = "clinicId";
        public static final String COLUMN_NAME_PATIENT_ID = "patientId";
        public static final String COLUMN_NAME_DOCTOR_ID = "doctorId";
        public static final String COLUMN_NAME_DATE_TIME = "dateTime";
        public static final String COLUMN_NAME_SERVICE = "service";
        public static final String COLUMN_NAME_SPECIALTY = "specialty";
        public static final String COLUMN_NAME_PRE_APPOINTMENT_ACTIONS = "preAppointmentActions";
        public static final String COLUMN_NAME_START_TIME = "startTime";
        public static final String COLUMN_NAME_END_TIME = "endTime";
    }
    public static abstract class ClinicEntry implements BaseColumns {
        public static final String TABLE_NAME = "clinic";
        public static final String COLUMN_NAME_CLINIC_ID = "clinicId";
        public static final String COLUMN_NAME_NAME = "name";   
        public static final String COLUMN_NAME_COUNTRY_ID = "countryId";
        public static final String COLUMN_NAME_ZIPCODE = "zipCode";
        public static final String COLUMN_NAME_TEL_NUMBER = "telNumber";
        public static final String COLUMN_NAME_FAX_NUMBER = "faxNumber";
    }

    public static abstract class SpecialtyEntry implements BaseColumns{
        public static final String TABLE_NAME = "specialty";
        public static final String COLUMN_NAME_SPECIALTY_ID = "specialtyId";
        public static final String COLUMN_NAME_SPECIALTY_NAME = "specialtyName";
    }

    public static abstract class DoctorEntry implements BaseColumns{
        public static final String TABLE_NAME = "doctor";
        public static final String COLUMN_NAME_DOCTOR_ID = "doctorId";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_SPECIALIZATION_ID = "specializationId";
        public static final String COLUMN_NAME_PRACTICE_DURATION = "practiceDuration";
    }

    public static abstract class DoctorScheduleEntry implements BaseColumns{
        public static final String TABLE_NAME = "doctorSchedule";
        public static final String COLUMN_NAME_DOCTOR_SCHEDULE_ID = "doctorScheduleId";
        public static final String COLUMN_NAME_DOCTOR_ID = "doctorId";
        public static final String COLUMN_NAME_START_TIME = "startTime";
        public static final String COLUMN_NAME_END_TIME = "endTime";
    }

    public static abstract class ServiceEntry implements BaseColumns{
        public static final String TABLE_NAME = "service";
        public static final String COLUMN_NAME_SERVICE_ID = "serviceId";
        public static final String COLUMN_NAME_SPECIALTY_ID = "specialtyId";
        public static final String COLUMN_NAME_SERVICE_DURATION = "serviceDuration";
    }

    public static abstract class PreAppoinmentActionEntry implements BaseColumns{
        public static final String TABLE_NAME = "preAppointmentAction";
        public static final String COLUMN_NAME_PREAPPOINTMENT_ACTION_ID = "preAppointmentActionId";
        public static final String COLUMN_NAME_SERVICE_ID = "serviceId";
        public static final String COLUMN_NAME_PREAPPOINTMENT_ACTION_NAME = "preAppointmentActionName"; 
    }

    public static abstract class PatientEntry implements BaseColumns extends AccountEntry{
        public static final String TABLE_NAME = "patient";
        public static final String COLUMN_NAME_PATIENT_ID = "patientId";
        public static final String COLUMN_NAME_AGE = "age";
        public static final String COLUMN_NAME_ACCOUNT_ID = "accountId";
    }

    public static abstract class AllergyEntry implements BaseColumns{
        public static final String TABLE_NAME = "allergy";
        public static final String COLUMN_NAME_ALLERGY_ID = "allergyId";
        public static final String COLUMN_NAME_ALLERGY_NAME = "allergyName";
    }


}
