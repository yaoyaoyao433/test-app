package com.meituan.debug;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile a m;
    final Context b;
    final WindowManager c;
    View d;
    FrameLayout e;
    TextView f;
    View g;
    ListView h;
    Button i;
    boolean j;
    final Handler k;
    final ArrayAdapter<String> l;
    private int n;
    private int o;
    private float p;
    private float q;
    private final List<String> r;

    public static a a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7216a5cc9345c22ecff35bf196b8c7d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7216a5cc9345c22ecff35bf196b8c7d0");
        }
        if (m == null) {
            synchronized (a.class) {
                m = new a(context);
            }
        }
        return m;
    }

    private a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c32068c3c6e28eb467b89fdca2aa3879", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c32068c3c6e28eb467b89fdca2aa3879");
            return;
        }
        this.r = new CopyOnWriteArrayList();
        this.k = new Handler(Looper.getMainLooper());
        this.b = context;
        this.c = (WindowManager) context.getSystemService("window");
        this.l = new ArrayAdapter<>(context, 17367043);
        com.meituan.android.privacy.interfaces.monitor.c.a = new b(com.meituan.android.privacy.interfaces.monitor.c.a, this);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a9c83eaccd0e3d6e301e470c1da21e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a9c83eaccd0e3d6e301e470c1da21e");
            return;
        }
        this.l.clear();
        this.l.addAll(this.r);
        this.l.notifyDataSetChanged();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f7cd0dc5d70f8572708a3661a6d3a5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f7cd0dc5d70f8572708a3661a6d3a5d");
        } else if (this.f != null) {
            if (this.r.isEmpty()) {
                this.f.setText("一切正常");
                this.e.setBackgroundResource(R.drawable.privacy_circle_green);
                return;
            }
            TextView textView = this.f;
            textView.setText("异常(" + this.r.size() + CommonConstant.Symbol.BRACKET_RIGHT);
            this.e.setBackgroundResource(R.drawable.privacy_circle_red);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc5c4fe93adead7b00d6ad779b73710d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc5c4fe93adead7b00d6ad779b73710d")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.p = motionEvent.getX();
            this.q = motionEvent.getY();
        }
        if (motionEvent.getAction() == 2) {
            float x = motionEvent.getX() - this.p;
            float y = motionEvent.getY() - this.q;
            this.n = (int) (this.n + x);
            this.o = (int) (this.o + y);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.d.getLayoutParams();
            layoutParams.x = this.n;
            layoutParams.y = this.o;
            this.c.updateViewLayout(this.d, layoutParams);
        }
        return false;
    }
}
