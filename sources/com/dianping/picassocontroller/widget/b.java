package com.dianping.picassocontroller.widget;

import android.view.View;
import com.dianping.picassocontroller.module.NavigatorModule;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface b {
    void a(NavigatorModule.NavItemArgument navItemArgument, View.OnClickListener onClickListener);

    void a(NavigatorModule.NavItemArgument[] navItemArgumentArr, View.OnClickListener onClickListener);

    boolean a();

    void b(NavigatorModule.NavItemArgument[] navItemArgumentArr, View.OnClickListener onClickListener);

    void setBackgroundColor(int i);

    void setHidden(boolean z);

    void setShadowColor(int i);
}
