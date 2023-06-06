package android.support.multidex;

import android.app.Application;
import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MultiDexApplication extends Application {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }
}
