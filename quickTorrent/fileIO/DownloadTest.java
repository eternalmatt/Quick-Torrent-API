package fileIO;

import java.io.IOException;

public class DownloadTest {

	public static void main(String[] args) throws IOException {
		DownloadFile myTorrentLink = new DownloadFile();
		System.out.println("http://isohunt.com/download/161705833/05402962822e5db9c1b9f613d7f139b14a7d818b.torrent");
		myTorrentLink.GetFileDownload("http://isohunt.com/download/161705833/05402962822e5db9c1b9f613d7f139b14a7d818b.torrent", "test");

	}

}