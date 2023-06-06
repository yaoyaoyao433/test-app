package com.sankuai.waimai.machpro.view.pool;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.image.MPImageView;
import com.sankuai.waimai.machpro.component.text.MPTextView;
import com.sankuai.waimai.machpro.component.view.c;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static HandlerThread h;
    public List<c> b;
    public List<MPTextView> c;
    public List<MPImageView> d;
    public volatile boolean e;
    public Handler f;
    public Handler g;

    static {
        HandlerThread handlerThread = new HandlerThread("mach-pro-thread");
        h = handlerThread;
        handlerThread.start();
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e94e67eca9671c83d96f52c12c611b39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e94e67eca9671c83d96f52c12c611b39");
            return;
        }
        this.b = new LinkedList();
        this.c = new LinkedList();
        this.d = new LinkedList();
        this.e = false;
        this.f = new a(h.getLooper());
        this.g = new HandlerC1026b(Looper.getMainLooper());
    }

    public final MPTextView a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bb6611bd5546460c456410f0bd9a171", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bb6611bd5546460c456410f0bd9a171");
        }
        if (this.c.size() > 0) {
            return this.c.remove(0);
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.machpro.view.pool.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class HandlerC1026b extends Handler {
        public static ChangeQuickRedirect a;

        public HandlerC1026b(Looper looper) {
            super(looper);
            Object[] objArr = {b.this, looper};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f222e0c678d4a2a83e79117002b59e6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f222e0c678d4a2a83e79117002b59e6");
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91c7731ffc7cf50a819935d46b8b3f64", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91c7731ffc7cf50a819935d46b8b3f64");
                return;
            }
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    if (message.obj instanceof List) {
                        b.this.b.addAll((Collection) message.obj);
                        com.sankuai.waimai.machpro.util.a.d("View预创建完成-->" + b.this.b.size());
                        return;
                    }
                    return;
                case 2:
                    if (message.obj instanceof List) {
                        b.this.c.addAll((Collection) message.obj);
                        com.sankuai.waimai.machpro.util.a.d("Text预创建完成-->" + b.this.c.size());
                        return;
                    }
                    return;
                case 3:
                    if (message.obj instanceof List) {
                        b.this.d.addAll((Collection) message.obj);
                        com.sankuai.waimai.machpro.util.a.d("Image预创建完成-->" + b.this.d.size());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends Handler {
        public static ChangeQuickRedirect a;

        public a(Looper looper) {
            super(looper);
            Object[] objArr = {b.this, looper};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee31ec26ece91561988edeaec1d3f6a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee31ec26ece91561988edeaec1d3f6a");
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = 0;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be2636d180e29d2246ef5440c873e8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be2636d180e29d2246ef5440c873e8a");
                return;
            }
            super.handleMessage(message);
            int i2 = message.arg1;
            Context context = message.obj == null ? null : (Context) ((WeakReference) message.obj).get();
            if (context == null) {
                return;
            }
            LinkedList linkedList = new LinkedList();
            switch (message.what) {
                case 1:
                    while (i < i2) {
                        if (!b.this.e) {
                            linkedList.add(new c(context));
                        }
                        i++;
                    }
                    break;
                case 2:
                    while (i < i2) {
                        if (!b.this.e) {
                            linkedList.add(new MPTextView(context));
                        }
                        i++;
                    }
                    break;
                case 3:
                    while (i < i2) {
                        if (!b.this.e) {
                            linkedList.add(new MPImageView(context));
                        }
                        i++;
                    }
                    break;
            }
            if (!b.this.e) {
                Message obtainMessage = b.this.g.obtainMessage(message.what);
                obtainMessage.obj = linkedList;
                b.this.g.sendMessage(obtainMessage);
                return;
            }
            linkedList.clear();
        }
    }
}
