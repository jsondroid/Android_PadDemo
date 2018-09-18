package jsondroid.android.com.android_paddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * ----------------------------------
     * 　　　　　　适配方案
     * ----------------------------------
     * <p>
     * 1、------------------layout------------------
     * 横竖屏切换不同的布局
     * lan 横屏
     * prot 竖屏 默认竖屏
     * ------------------layout------------------
     * <p>
     * 2、------------------drawable------------------
     * drawable-ldpi (dpi=120, density=0.75)
     * drawable-mdpi (dpi=160, density=1)
     * drawable-hdpi (dpi=240, density=1.5)
     * drawable-xhdpi (dpi=320, density=2)
     * drawable-xxhdpi (dpi=480, density=3)
     * ------------------drawable------------------
     * <p>
     * <p>
     * <p>
     * 3、------------------values------------------
     * 36x36 (0.75x) 用于低密度 ---->small
     * 48x48（1.0x 基线）用于中密度---->normal
     * 72x72 (1.5x) 用于高密度--------->large
     * 96x96 (2.0x) 用于超高密度------->xlarge
     * 144x144 (3.0x) 用于超超高密度------->xxlarge
     * 192x192 (4.0x) 用于超超超高密度------->xxxlarge（仅限启动器图标；请参阅上面的 注）
     * <p>
     * large->normal 大屏到基准屏比例->宽和高相差1.5倍（如large=400dp/1.5 -> normal=266dp）
     * normal->small 基准屏到小屏比例->宽和高相差1.3倍（如large=266dp/1.3 -> normal=204dp）
     * 当以large为基准设计时计算方式是(直接等比计算)：
     * large--->normal(large/normal=1.5)
     * large--->small(large/small=2)
     * ------------------values------------------
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
