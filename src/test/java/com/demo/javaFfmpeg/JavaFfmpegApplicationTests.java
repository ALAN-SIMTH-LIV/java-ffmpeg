package com.demo.javaFfmpeg;

import com.demo.javaFfmpeg.utils.FfmpegUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class JavaFfmpegApplicationTests {

	@Autowired
	private FfmpegUtils ffmpegUtils;

	@Test
	void contextLoads() {
		System.out.println(System.getProperty("os.name").toLowerCase());
		System.out.println(System.getProperty("os.name").getClass());
	}

	@Test
	void createImageThumbnail(){
		String img = "\"C:\\Users\\Y9000P\\OneDrive\\桌面\\video\\docker_logo.png\"";

		ffmpegUtils.createImageThumbnail(img);
	}

	@Test
	void getVideoCodec(){
		String video = "\"C:\\Users\\Y9000P\\OneDrive\\桌面\\video\\train\\input.mp4\"";

		System.out.println(ffmpegUtils.getVideoCodec(video));
	}

	@Test
	void convertHevc2Mp4(){
		String dir = "C:\\Users\\Y9000P\\OneDrive\\桌面\\video\\train\\test";
		String input  = dir + "\\input1.mp4";
		String output = dir + "\\output.mp4";
		ffmpegUtils.convertHevc2Mp4(input, output);
	}

	@Test
	void convertVideo2Ts(){
		String filePath = "\"C:\\Users\\Y9000P\\OneDrive\\桌面\\video\\train\\input.mp4\"";

		String fileDir = "C:\\Users\\Y9000P\\OneDrive\\桌面\\video\\train\\input";

		ffmpegUtils.convertVideo2Ts(new File(fileDir),filePath);
	}

	@Test
	void getVideoInfoDuration(){
		String video = "\"C:\\Users\\Y9000P\\OneDrive\\桌面\\video\\train\\input.mp4\"";
		System.out.println(ffmpegUtils.getVideoInfoDuration(video));
	}
}
