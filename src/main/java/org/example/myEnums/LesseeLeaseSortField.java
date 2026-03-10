package org.example.myEnums;

public enum LesseeLeaseSortField {

    //@formatter:off
    LANDMARK_NAME("landmarkName", "geo_name"),
    ASSET_ID("custAssetID", "asset_id"),
    LEASED_FROM("leasedFromCustName", "leased_from"),
    ASSET_TYPE("assetType", "asset_type_name"),
    LEASE_STARTED_FROM("leaseStartedFromMillis", "lease_started_from"),
    LEASE_DURATION_DAYS("leaseDurationDays", "lease_duration_hours"),
    SERIAL_NUM("mtsn", "serial_num"),
    MOTION_STARTED_ON("startedMovingFromMillisUTC","motion_started_on"),
    MOTION_DURATION("movingDurationMinutes","motion_duration_hours"),
    IDLE_DURATION("idleTimeHours","idle_duration_hours"),
    DWELL_STARTED_ON("arrivedAtLandmarkMillisUTC","dwell_started_on"),
    LAST_OBS_TIME("lastReportedTimeMillisUTC","last_obs_time");
    //@formatter:on

    private final String uiFieldName;
    private final String dbAlias;

    LesseeLeaseSortField(String uiFieldName, String dbAlias) {
        this.uiFieldName = uiFieldName;
        this.dbAlias = dbAlias;
    }

    public String uiFieldName() {
        return uiFieldName;
    }

    public String dbAlias() {
        return dbAlias;
    }

}
// what shold be the output of the below code snippet
// Arrays.stream(LeaseeLeasedAssets.values()).map(LeaseeLeasedAssets::getUiField).forEach(System.out::println);
