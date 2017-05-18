package logEntry;

public final class LogEntryStartTransaction extends LogEntry{
	
	public LogEntryStartTransaction(String input){
		
		super.entryType = LogEntryType.StartTransaction;
		super.feature = null;
		super.newValue = null;
		super.oldValue = null;
		super.envolvedTransaction = input.replace("<Start", "").replace("<start", "").replace(">","").trim();
	}
}
