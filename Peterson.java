package springbatch.poc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class Peterson implements Lock {
	private boolean[] flag = new boolean[2];
	private int victim;

	public void lock() {
		int i = ThreadID.get(); // either 0 or 1
		int j = 1 - i;
		flag[i] = true;
		victim = i;
		while (flag[j] && victim == i) {
		}
		; // spin
	}

	public void lockInterruptibly() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	public boolean tryLock() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean tryLock(long time, TimeUnit unit)
			throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}

	public void unlock() {
		// TODO Auto-generated method stub

	}

	public Condition newCondition() {
		// TODO Auto-generated method stub
		return null;
	}
}
