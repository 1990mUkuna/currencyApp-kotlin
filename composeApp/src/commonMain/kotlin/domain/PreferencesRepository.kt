package domain

interface PreferencesRepository {
    suspend fun savedLastUpdated(lastUpdated: String)
    suspend fun isDataFresh(currentTimestamp: Long): Boolean
}