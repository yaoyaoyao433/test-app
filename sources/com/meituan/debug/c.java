package com.meituan.debug;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.android.cipstorage.q;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static q b;
    private static ListView d;
    private static View e;
    private static Handler f;
    private static final AtomicBoolean c = new AtomicBoolean();
    private static Queue<Spannable> g = new ConcurrentLinkedQueue();
    private static List<Spannable> h = Collections.emptyList();
    private static final BaseAdapter i = new BaseAdapter() { // from class: com.meituan.debug.c.3
        public static ChangeQuickRedirect a;

        @Override // android.widget.Adapter
        public final long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5063e50451c0c7f21114056e517e9ad1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5063e50451c0c7f21114056e517e9ad1")).intValue() : c.h.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.widget.Adapter
        /* renamed from: a */
        public Spannable getItem(int i2) {
            Object[] objArr = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0fa9169191166e1b45d5f94adc14993", RobustBitConfig.DEFAULT_VALUE) ? (Spannable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0fa9169191166e1b45d5f94adc14993") : (Spannable) c.h.get(i2);
        }

        @Override // android.widget.Adapter
        public final View getView(int i2, View view, ViewGroup viewGroup) {
            TextView textView;
            Object[] objArr = {Integer.valueOf(i2), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a37ebe6885d9014179b1816f4458f30", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a37ebe6885d9014179b1816f4458f30");
            }
            if (view != null) {
                textView = (TextView) view;
            } else {
                textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_netfilter, viewGroup, false);
            }
            textView.setText(getItem(i2));
            return textView;
        }
    };

    public static /* synthetic */ void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06dda3fd4ca204839db1a86d6039abc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06dda3fd4ca204839db1a86d6039abc5");
            return;
        }
        Context context = PermissionGuard.a.a.getContext(null);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_dev_netfilter, (ViewGroup) null);
        e = inflate;
        ListView listView = (ListView) inflate.findViewById(R.id.lv_filter);
        d = listView;
        listView.setAdapter((ListAdapter) i);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2);
        layoutParams.gravity = 51;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = 1;
        layoutParams.flags = 56;
        e.setLayoutParams(layoutParams);
        windowManager.addView(e, layoutParams);
    }

    public static /* synthetic */ void a(Spannable spannable) {
        Object[] objArr = {spannable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c5c203bb17eef61d409ceaf80e0dc15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c5c203bb17eef61d409ceaf80e0dc15");
            return;
        }
        g.offer(spannable);
        if (g.size() > 6) {
            g.poll();
        }
        if (f.hasMessages(2)) {
            return;
        }
        f.sendEmptyMessageDelayed(2, 1000L);
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06712f14a533a8144b52634e59cb6d6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06712f14a533a8144b52634e59cb6d6e");
        } else if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    q a2 = q.a(context, "privacy_netfilter_dev");
                    b = a2;
                    if (a2.b("show_overlay", false) && d.a(context)) {
                        f();
                    }
                }
            }
        }
    }

    @MainThread
    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9698ec9965e2a26045b3c4e9fc6b85b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9698ec9965e2a26045b3c4e9fc6b85b9");
            return;
        }
        b.a("show_overlay", z);
        if (z) {
            f();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "64dd7590d2de470422bb8148b50490b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "64dd7590d2de470422bb8148b50490b7");
        } else if (e != null) {
            ((WindowManager) PermissionGuard.a.a.getContext(null).getSystemService("window")).removeView(e);
            c.set(false);
            e = null;
            d = null;
        }
    }

    private static void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce07a03f3f26be80388c7d25a1bbdf28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce07a03f3f26be80388c7d25a1bbdf28");
        } else if (c.compareAndSet(false, true)) {
            com.meituan.android.privacy.impl.monitor.c.b(new com.meituan.android.privacy.interfaces.monitor.b() { // from class: com.meituan.debug.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.monitor.b
                public final void a(com.meituan.android.privacy.interfaces.monitor.d dVar) {
                }

                @Override // com.meituan.android.privacy.interfaces.monitor.b
                @SuppressLint({"NewApi"})
                public final void a(c.a aVar, int i2) {
                    Object[] objArr2 = {aVar, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1a5577ada4138517eda7a8c2c6adfee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1a5577ada4138517eda7a8c2c6adfee");
                        return;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append("origin: ", new ForegroundColorSpan(-16776961), 33);
                    spannableStringBuilder.append(aVar.d(), new ForegroundColorSpan((int) SupportMenu.CATEGORY_MASK), 33);
                    spannableStringBuilder.append("\nfilter: ", new ForegroundColorSpan(-16776961), 33);
                    String e2 = aVar.e();
                    if (e2 == null) {
                        e2 = StringUtil.NULL;
                    }
                    spannableStringBuilder.append(e2, new ForegroundColorSpan(-16777216), 33);
                    spannableStringBuilder.append("\nstatucCode: " + aVar.a(), new ForegroundColorSpan(-16711936), 33);
                    c.a(spannableStringBuilder);
                }

                @Override // com.meituan.android.privacy.interfaces.monitor.b
                @SuppressLint({"NewApi"})
                public final void b(c.a aVar, int i2) {
                    Object[] objArr2 = {aVar, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb4ee91292dabac2e2a3677313247eb2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb4ee91292dabac2e2a3677313247eb2");
                        return;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append("error: ", new ForegroundColorSpan(-16776961), 33);
                    spannableStringBuilder.append(aVar.d(), new ForegroundColorSpan((int) SupportMenu.CATEGORY_MASK), 33);
                    spannableStringBuilder.append((CharSequence) " supportType=").append((CharSequence) String.valueOf(aVar.b()));
                    spannableStringBuilder.append((CharSequence) ",code=").append((CharSequence) String.valueOf(aVar.a()));
                    c.a(spannableStringBuilder);
                }
            });
            f = new a(Looper.getMainLooper());
            Runnable runnable = new Runnable() { // from class: com.meituan.debug.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0677687e8011123b2143d7fa12d71496", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0677687e8011123b2143d7fa12d71496");
                    } else {
                        c.a();
                    }
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnable);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;

        public a(Looper looper) {
            super(looper);
            Object[] objArr = {looper};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "344f0b66f397e2265eb9a1c30e086d76", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "344f0b66f397e2265eb9a1c30e086d76");
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80579bee243b51135730cfd13d278d70", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80579bee243b51135730cfd13d278d70");
            } else if (message.what != 2) {
            } else {
                List unused = c.h = new ArrayList(c.g);
                if (c.d != null) {
                    c.i.notifyDataSetChanged();
                    c.d.smoothScrollToPosition(c.h.size());
                }
            }
        }
    }
}
