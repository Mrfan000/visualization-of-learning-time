import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author fanyu
 * @time 下午3:09 2021/10/24
 */
public class Main {
    public static void main(String[] args) {
//        //创建generator对象
//        AutoGenerator autoGenerator = new AutoGenerator;
////        数据源
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();


        //全局配置
        GlobalConfig gc = new GlobalConfig();
        //生成文件的位置
        gc.setOutputDir("/home/fanyu/IdeaProjects/visualization-of-learning-time/study-server/src/main/java/");
        gc.setAuthor("AssassinLeon");
        gc.setEnableCache(true);     //是否启用二级缓存
        gc.setActiveRecord(true);    //是否支持AR模式。
        gc.setIdType(IdType.ASSIGN_UUID);   //默认主键生成策略
        gc.setBaseColumnList(true);  //xml中生成查询字段
        gc.setBaseResultMap(true);   //xml中生成resultmap

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
         gc.setMapperName("%sMapper");   //生成Mapper层的名称
         gc.setXmlName("%sMapper");      //生成Xml映射层的名称
         gc.setServiceName("%sService");  //生成Service接口的名称
         gc.setServiceImplName("%sServiceImpl");  //生成Service实现类的名称
         gc.setControllerName("%sController");  //生成控制器类的名称


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MARIADB);
        dsc.setDriverName("org.mariadb.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mariadb://127.0.0.1:3306/visual_time?characterEncoding=utf8");

        // 策略配置
        StrategyConfig sc = new StrategyConfig();
        sc.setTablePrefix("tb_");// 此处可以修改为您的表前缀
        sc.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        //sc.setInclude(new String[] { "user" }); // 需要生成的表
        //sc.setExclude(new String[]{"test"}); // 排除生成的表

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("icu.fanyu.study");
        //pc.setModuleName("mypro");

        AutoGenerator ag = new AutoGenerator();  //生成工具类
        ag.setGlobalConfig(gc);   //添加全局配置
        ag.setDataSource(dsc);    //添加数据源配置
        ag.setStrategy(sc);       //添加策略配置
        ag.setPackageInfo(pc);    //添加包配置
        ag.execute();  //执行生成操作


    }
}
