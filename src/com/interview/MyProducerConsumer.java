package com.interview;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
 * 
*/

public class MyProducerConsumer {

	public static void main(String[] args) {

		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);

		Producer producer = new Producer(blockingQueue);
		Consumer consumer = new Consumer(blockingQueue);

		new Thread(producer).start();
		new Thread(consumer).start();
	}
}

class Consumer implements Runnable {

	private BlockingQueue<Integer> blockingQueue;

	public Consumer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {

		try {
			blockingQueue.put(1);
			blockingQueue.put(1);
			blockingQueue.put(1);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Producer implements Runnable {

	private BlockingQueue<Integer> blockingQueue;

	public Producer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {

		try {
			blockingQueue.take();
			blockingQueue.take();
			blockingQueue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
