package logEntry;

public class LogEntryCommitTransaction extends LogEntry {
	
	public LogEntryCommitTransaction(String input){
		
		super.entryType = LogEntryType.CommitTransaction;
		super.feature = null;
		super.newValue = null;
		super.oldValue = null;
		super.involvedTransaction = input.replaceAll("(?i)<Commit", "").replace(">","").trim();
	}
}
