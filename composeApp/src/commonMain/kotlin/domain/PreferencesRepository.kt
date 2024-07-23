package domain

interface PreferencesRepository {
    fun savedLastUpdated(lastUpdated: String)
    fun isDataFresh(currentTimestamp: Long): Boolean
}