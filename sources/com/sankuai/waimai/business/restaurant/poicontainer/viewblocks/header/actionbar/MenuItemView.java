package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.actionbar;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MenuItemView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private Context b;
    private TextView c;
    private TextView d;
    private ImageView e;
    private TextView f;
    private boolean g;
    private boolean h;

    public MenuItemView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d97912923ddbe5a0b18974e28203e64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d97912923ddbe5a0b18974e28203e64");
            return;
        }
        this.b = context;
        a(context);
    }

    public MenuItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ab21a7d51d3fbe3e5cd460b745ddff0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ab21a7d51d3fbe3e5cd460b745ddff0");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62d9c7dc8ebeaf5bf3b50afa2a74c64e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62d9c7dc8ebeaf5bf3b50afa2a74c64e");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.wm_restaurant_right_menu_item, this);
        this.c = (TextView) findViewById(R.id.menu_icon);
        this.d = (TextView) findViewById(R.id.menu_name);
        this.e = (ImageView) findViewById(R.id.red_point);
        this.f = (TextView) findViewById(R.id.unread_message_count);
    }

    public void setMenuIcon(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a88f37227e743fe5400256c81cf58df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a88f37227e743fe5400256c81cf58df");
        } else {
            b.a(this.c, i, R.color.roo_color_gray);
        }
    }

    public void setMenuName(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db55921b01b648c6a0a0e2ecb88e45be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db55921b01b648c6a0a0e2ecb88e45be");
        } else {
            this.d.setText(i);
        }
    }

    public void setRedPointVisiable(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07288cad829ed9411e2f175484bf9a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07288cad829ed9411e2f175484bf9a41");
        } else {
            ((Activity) this.b).runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.actionbar.MenuItemView.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb2ee2663c82e2e506f0d0cb0fab2245", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb2ee2663c82e2e506f0d0cb0fab2245");
                    } else if (z) {
                        MenuItemView.this.e.setVisibility(0);
                        MenuItemView.this.g = true;
                    } else {
                        MenuItemView.this.e.setVisibility(8);
                        MenuItemView.this.g = false;
                    }
                }
            });
        }
    }

    public boolean getRedPointVisiable() {
        return this.g;
    }

    public boolean getUnReadMsgVisiable() {
        return this.h;
    }

    public boolean getUnReadOrRedDotVisible() {
        return this.h || this.g;
    }

    public void setUnreadMessageCount(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c47cc570c177c5cc10d4d58a32e18e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c47cc570c177c5cc10d4d58a32e18e8");
        } else {
            ((Activity) this.b).runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.actionbar.MenuItemView.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1ca1a4150153ab9e6a6e2b0bd926904", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1ca1a4150153ab9e6a6e2b0bd926904");
                        return;
                    }
                    if (i <= 0) {
                        MenuItemView.this.f.setVisibility(8);
                        MenuItemView.this.h = false;
                    } else {
                        MenuItemView.this.f.setVisibility(0);
                        MenuItemView.this.h = true;
                    }
                    if (i > 0 && i <= 99) {
                        MenuItemView.this.f.setText(String.valueOf(i));
                    } else if (i > 99) {
                        MenuItemView.this.f.setText("99+");
                    }
                }
            });
        }
    }
}
