package in.kanth.multiThreading;

import java.time.Instant;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.log4j.Logger;

import in.kanth.beans.CompBean;
import in.kanth.beans.EmpBean;
import in.kanth.beans.ManagerBean;
import in.kanth.beans.SupportBean;
import in.kanth.services.ServiceObjectFactory;

public class ExecutorCheck {

	public static ServiceObjectFactory factory = new ServiceObjectFactory();
	public final static Logger logger = Logger.getLogger(ExecutorCheck.class);
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		long start = 0l;
		long end = 0l;

		start = Instant.now().toEpochMilli();
		
		//Callable<Map<Integer, EmpBean>> emptemp =factory.getEmployeeService()::getEmployeeData ; 

//		Callable<Map<Integer, EmpBean>> emp = new Callable<Map<Integer, EmpBean>>() {
//			@Override
//			public Map<Integer, EmpBean> call() throws Exception {
//				return factory.getEmployeeService().getEmployeeData();
//			}
//		};

		Callable<Map<Integer, ManagerBean>> mangaer = new Callable<Map<Integer, ManagerBean>>() {
			@Override
			public Map<Integer, ManagerBean> call() throws Exception {
				return factory.getManagerService().getManagerData();
			}
		};

		Callable<Map<Integer, CompBean>> comp = new Callable<Map<Integer, CompBean>>() {
			@Override
			public Map<Integer, CompBean> call() throws Exception {
				return factory.getCompanyService().getCompanyData();
			}
		};

		Callable<Map<Integer, SupportBean>> sup = new Callable<Map<Integer, SupportBean>>() {
			@Override
			public Map<Integer, SupportBean> call() throws Exception {
				return factory.getSupportService().getSupportData();
			}
		};
		ExecutorService executors = Executors.newFixedThreadPool(4);
		Future<Map<Integer, EmpBean>> m5 = executors.submit(()->{
			return factory.getEmployeeService().getEmployeeData();
		});
		Future<Map<Integer, CompBean>> m6 = executors.submit(comp);
		Future<Map<Integer, ManagerBean>> m7 = executors.submit(mangaer);
		Future<Map<Integer, SupportBean>> m8 = executors.submit(sup);
		Map<Integer, EmpBean> m55 = m5.get();
		Map<Integer, CompBean> m66 = m6.get();
		Map<Integer, ManagerBean> m77 = m7.get();
		Map<Integer, SupportBean> m88 = m8.get();
		executors.shutdown();
		end = Instant.now().toEpochMilli();
		logger.info("Executor " + (end - start));
		
		logger.info(Runtime.getRuntime().availableProcessors());


	/*	start = Instant.now().toEpochMilli();
		Map<Integer, EmpBean> m1 = factory.getEmployeeService().getEmployeeData();
		Map<Integer, CompBean> m2 = factory.getCompanyService().getCompanyData();
		Map<Integer, ManagerBean> m3 = factory.getManagerService().getManagerData();
		Map<Integer, SupportBean> m4 = factory.getSupportService().getSupportData();
		end = Instant.now().toEpochMilli();
		System.out.println("Noraml execution " + (end - start));*/


	}

}
