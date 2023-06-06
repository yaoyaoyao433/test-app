package com.dianping.picassocontroller.widget;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.imagemanager.DPImageView;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picassocontroller.module.NavigatorModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NavigationItemView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private DPImageView c;

    public NavigationItemView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff27b73a7d1a6f0cbe1482d10b731a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff27b73a7d1a6f0cbe1482d10b731a2");
        }
    }

    public NavigationItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74ab2c3319b64e446c9d7cf402c89b8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74ab2c3319b64e446c9d7cf402c89b8d");
        }
    }

    public NavigationItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e882ca3cc169d43360636dfcaf3f809b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e882ca3cc169d43360636dfcaf3f809b");
        } else {
            setup(context);
        }
    }

    private void setup(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "582d781d14e1806e37763c79a84e5e4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "582d781d14e1806e37763c79a84e5e4b");
            return;
        }
        setOrientation(0);
        this.b = new TextView(context);
        this.b.setMaxLines(1);
        this.b.setTextSize(1, 16.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.c = new DPImageView(context);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.c.setAdjustViewBounds(true);
    }

    private void setIconName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9725de22891093c5e3abbb2c1c55436", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9725de22891093c5e3abbb2c1c55436");
            return;
        }
        this.c.setVisibility(0);
        int identifier = getContext().getResources().getIdentifier(str.toLowerCase(), PicassoUtils.DEF_TYPE, getContext().getApplicationContext().getPackageName());
        if (identifier > 0) {
            this.c.setImageResource(identifier);
        }
    }

    private void setIconBase64(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0942b7f9ef8b84a4779fa8f928342e1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0942b7f9ef8b84a4779fa8f928342e1d");
            return;
        }
        this.c.setVisibility(0);
        Matcher matcher = Pattern.compile("data:image/(\\S+?);base64,(\\S+)").matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (TextUtils.isEmpty(group) || TextUtils.isEmpty(group2)) {
                return;
            }
            try {
                byte[] decode = Base64.decode(group2, 0);
                this.c.setImageBitmap(com.sankuai.waimai.launcher.util.image.a.a(decode, 0, decode.length));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void setIconSize(NavigatorModule.NavItemArgument navItemArgument) {
        Object[] objArr = {navItemArgument};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3916f361f4b2394bc16598343d87ffcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3916f361f4b2394bc16598343d87ffcd");
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(PicassoUtils.dp2px(getContext(), navItemArgument.iconWidth), PicassoUtils.dp2px(getContext(), navItemArgument.iconHeight));
        layoutParams.gravity = 17;
        if (navItemArgument.titleLeft) {
            layoutParams.leftMargin = a(navItemArgument.spacing);
        }
        this.c.setLayoutParams(layoutParams);
    }

    private void setIconUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a7fc41da5da24e849b5d05fd986c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a7fc41da5da24e849b5d05fd986c43");
            return;
        }
        this.c.setVisibility(0);
        this.c.setImage(str);
    }

    private void setText(NavigatorModule.NavItemArgument navItemArgument) {
        Object[] objArr = {navItemArgument};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b85730a326b8153eccd81b3bec3e2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b85730a326b8153eccd81b3bec3e2e");
            return;
        }
        this.b.setVisibility(0);
        this.b.setText(navItemArgument.title);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (!navItemArgument.titleLeft) {
            layoutParams.leftMargin = a(navItemArgument.spacing);
        }
        this.b.setLayoutParams(layoutParams);
        if (!TextUtils.isEmpty(navItemArgument.titleColor)) {
            try {
                this.b.setTextColor(Color.parseColor(navItemArgument.titleColor));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.b.setTextColor(-16777216);
        }
        this.b.setTextSize(1, navItemArgument.titleSize > 0 ? navItemArgument.titleSize : 16);
        if (navItemArgument.boldFont) {
            this.b.getPaint().setFakeBoldText(true);
        }
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75810b2a0bb65b825710f5f654f3b845", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75810b2a0bb65b825710f5f654f3b845")).intValue();
        }
        if (i == 0) {
            i = 3;
        }
        return PicassoUtils.dp2px(getContext(), i);
    }

    public final void a(NavigatorModule.NavItemArgument navItemArgument) {
        Object[] objArr = {navItemArgument};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f148cbf8898ccdb3f386ddf0482667a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f148cbf8898ccdb3f386ddf0482667a");
        } else if (navItemArgument == null) {
        } else {
            removeAllViews();
            if (navItemArgument.titleLeft) {
                addView(this.b);
                addView(this.c);
            } else {
                addView(this.c);
                addView(this.b);
            }
            if (!TextUtils.isEmpty(navItemArgument.title)) {
                setText(navItemArgument);
            } else {
                this.b.setVisibility(8);
            }
            if (!TextUtils.isEmpty(navItemArgument.iconName)) {
                setIconName(navItemArgument.iconName);
                setIconSize(navItemArgument);
            } else if (!TextUtils.isEmpty(navItemArgument.iconUrl)) {
                setIconUrl(navItemArgument.iconUrl);
                setIconSize(navItemArgument);
            } else if (!TextUtils.isEmpty(navItemArgument.iconBase64)) {
                setIconBase64(navItemArgument.iconBase64);
                setIconSize(navItemArgument);
            } else {
                this.c.setVisibility(8);
            }
            String str = navItemArgument.accessLabel;
            if (TextUtils.isEmpty(str)) {
                str = navItemArgument.title;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            setContentDescription(str);
        }
    }

    public CharSequence getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81e452422fdcd0691b84d3ea847ed859", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81e452422fdcd0691b84d3ea847ed859") : this.b.getText();
    }

    public TextPaint getTextPaint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ceec8aad39fa5f840548d88080ac5d", RobustBitConfig.DEFAULT_VALUE) ? (TextPaint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ceec8aad39fa5f840548d88080ac5d") : this.b.getPaint();
    }
}
