package fr.rakambda.ftpfetcher.downloader;

public class StopDownloaderException extends RuntimeException{
	public StopDownloaderException(String message){
		super(message);
	}
}
