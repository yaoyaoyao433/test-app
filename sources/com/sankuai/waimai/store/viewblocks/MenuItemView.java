package com.sankuai.waimai.store.viewblocks;

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
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MenuItemView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    protected Context b;
    protected ImageView c;
    protected TextView d;
    protected ImageView e;
    protected TextView f;
    protected TextView g;
    protected boolean h;
    protected boolean i;

    public MenuItemView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "276584bb3f743d51d6f3c7cbcef46173", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "276584bb3f743d51d6f3c7cbcef46173");
            return;
        }
        this.b = context;
        a(context);
    }

    public MenuItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9879a13ec68b4ce6af5f4aa71c1a4797", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9879a13ec68b4ce6af5f4aa71c1a4797");
        } else {
            a(context);
        }
    }

    public void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d216d8d147c913d43e5e8ecff8812d74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d216d8d147c913d43e5e8ecff8812d74");
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.wm_sc_goods_list_right_menu_item, this);
        this.c = (ImageView) findViewById(R.id.menu_icon);
        this.d = (TextView) findViewById(R.id.menu_name);
        this.e = (ImageView) findViewById(R.id.red_point);
        this.f = (TextView) findViewById(R.id.unread_message_count);
        this.g = (TextView) findViewById(R.id.home_search_unread_message_count);
    }

    public ImageView getMenuIconView() {
        return this.c;
    }

    public void setMenuIcon(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51c0188231faec845a0783a36bb73f01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51c0188231faec845a0783a36bb73f01");
        } else {
            this.c.setImageResource(i);
        }
    }

    public void setMenuIcon(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4662b0f8f894df674bf3ca939250451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4662b0f8f894df674bf3ca939250451");
            return;
        }
        b.C0608b a2 = m.a(str, com.sankuai.shangou.stone.util.h.a(getContext(), 24.0f), com.sankuai.shangou.stone.util.h.a(getContext(), 24.0f), ImageQualityUtil.a());
        a2.g = false;
        a2.a(this.c);
    }

    public void setMenuName(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04bba1d83ae39535e0c4caba85c6baaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04bba1d83ae39535e0c4caba85c6baaa");
        } else {
            this.d.setText(i);
        }
    }

    public void setMenuName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15af4ddc4e5030f48e5a37727a3badde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15af4ddc4e5030f48e5a37727a3badde");
        } else {
            this.d.setText(str);
        }
    }

    public void setMenuNameColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd6e0966d2dc951dbb743fac9b1bd929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd6e0966d2dc951dbb743fac9b1bd929");
        } else {
            this.d.setTextColor(i);
        }
    }

    public void setRedPointVisiable(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "353fbd76f260f37cf5cbfe0bd052c449", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "353fbd76f260f37cf5cbfe0bd052c449");
        } else {
            ((Activity) this.b).runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.store.viewblocks.MenuItemView.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f54107da8caa54e39478405571e69ccb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f54107da8caa54e39478405571e69ccb");
                    } else if (z) {
                        MenuItemView.this.e.setVisibility(0);
                        MenuItemView.this.h = true;
                    } else {
                        MenuItemView.this.e.setVisibility(8);
                        MenuItemView.this.h = false;
                    }
                }
            });
        }
    }

    public boolean getUnReadOrRedDotVisible() {
        return this.i || this.h;
    }

    public void setUnreadMessageCount(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99dc887c59d2ca9cce69a769ad152691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99dc887c59d2ca9cce69a769ad152691");
        } else {
            ((Activity) this.b).runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.store.viewblocks.MenuItemView.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f795bc6448e458dafed6fc0d655b52b4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f795bc6448e458dafed6fc0d655b52b4");
                        return;
                    }
                    if (i <= 0) {
                        MenuItemView.this.f.setVisibility(8);
                        MenuItemView.this.i = false;
                    } else {
                        MenuItemView.this.f.setVisibility(0);
                        MenuItemView.this.i = true;
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

    public void setUnreadMessageCountInHomeSearchRight(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08e8c714b75cabe077e2a57dc6a84b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08e8c714b75cabe077e2a57dc6a84b71");
        } else {
            ((Activity) this.b).runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.store.viewblocks.MenuItemView.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4277a35af1a40a0a11356abf6eb25e31", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4277a35af1a40a0a11356abf6eb25e31");
                        return;
                    }
                    if (i <= 0) {
                        MenuItemView.this.g.setVisibility(8);
                        MenuItemView.this.i = false;
                    } else {
                        MenuItemView.this.g.setVisibility(0);
                        MenuItemView.this.i = true;
                    }
                    if (i > 0 && i <= 99) {
                        MenuItemView.this.g.setText(String.valueOf(i));
                    } else if (i > 99) {
                        MenuItemView.this.g.setText("99+");
                    }
                }
            });
        }
    }
}
