import java.util.Scanner;
public class 商品入库 {
	public static void main(String[] args) {
		String huaweiBrand = "华为";
		double huaweiSize = 5.5;
		double huaweiPrince = 3688.88;
		String huaweiConfig = "6+128G";
		System.out.println("品牌型号"+huaweiBrand);
		System.out.println("尺寸"+huaweiSize);
		System.out.println("价格"+huaweiPrince);
		System.out.println("配置"+huaweiConfig);
		//通过控制台实现库存的输入
		Scanner input = new Scanner (System.in);
		System.out.println("请输入华为商品的数量");
		int huaweiCount = input.nextInt();
		System.out.println("库存华为的总价："+huaweiPrince*huaweiCount);
		String xiaomiBrand = "小米";
		double xiaomiSize = 5.0;
		double xiaomiPrince = 2988.88;
		String xiaomiConfig = "4+64G";
		System.out.println("品牌型号"+xiaomiBrand);
		System.out.println("尺寸"+xiaomiSize);
		System.out.println("价格"+xiaomiPrince);
		System.out.println("配置"+xiaomiConfig);
		System.out.println("请输入小米商品的数量");
		int xiaomiCount = input.nextInt();
		System.out.println("库存小米的总价："+xiaomiPrince*xiaomiCount);
		System.out.println("------------库存清单--------------");
		System.out.println("品牌型号   尺寸    价格       配置");
		System.out.println(huaweiBrand+"     "+huaweiSize+"    "+huaweiPrince+"    "+huaweiConfig);
		System.out.print(xiaomiBrand+"     ");
		System.out.print(xiaomiSize+"    ");
		System.out.print(xiaomiPrince+"    ");
		System.out.println(xiaomiConfig);
		System.out.println("------------库存清单--------------");
		System.out.println("总库存"+(int)(huaweiCount+xiaomiCount));
		System.out.println("库存总价"+(double)(huaweiPrince+xiaomiPrince)+"$");
		}
}
