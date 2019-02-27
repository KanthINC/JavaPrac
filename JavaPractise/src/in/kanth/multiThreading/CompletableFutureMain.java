package in.kanth.multiThreading;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

import in.kanth.beans.CompBean;
import in.kanth.collections.bo.Employee;
import in.kanth.services.ServiceObjectFactory;

/**
 * 
 * @author ramakanth.b Java 8 Specific
 */
public class CompletableFutureMain {

	public static ServiceObjectFactory factory = new ServiceObjectFactory();

	public static void main(String[] args) {

		// Executor executor = Executors.newFixedThreadPool(4);

		CompletableFuture<Map<Integer, CompBean>> getCompany = CompletableFuture.supplyAsync(() -> {
			return factory.getCompanyService().getCompanyData();
		});

		/*Map<Integer, CompBean> mycomp = getCompany.get();
		System.out.println(mycomp.size());*/
		
		
//		CompletableFuture<Map<String, Employee>> getDetail = CompletableFuture.supplyAsync(
//				() -> {
//			return factory.getDetailListService().getmyDetailList();
//		})
//		.thenApplyAsync(
//				v->{v.stream().collect(Collectors.toMap(s->s.getGuid+s.getEmpid, Function.identity(),(s1,s2)->{
//			return s1;
//		}))});

		
/*		CompletableFuture<Map<String, Employee>> getDetail1 = CompletableFuture.supplyAsync(
				() -> {
			return factory.getDetailListService().getmyDetailList();
		}).thenApplyAsync(v->{
			v.stream().collect(Collectors.toMap(s->s.getGuid+s.getEmpid, Function.identity(),(s1,s2)->{
				return s1;
			}));
		});*/
		
		
		CompletableFuture<List<Employee>> getDetail2 = CompletableFuture.supplyAsync(
				() -> {
			return factory.getDetailListService().getmyDetailList();
		});
	/*	 
		CompletableFuture<Map<String, Employee>> detail22=getDetail2.thenApplyAsync(v->{
			v.stream().collect(Collectors.toMap(s->s.getGuid+s.getEmpid, Function.identity()));
		});
		detail22.get();*/
	}

}
