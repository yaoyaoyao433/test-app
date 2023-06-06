package com.meizu.cloud.pushsdk;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a.d;
import com.meizu.cloud.pushsdk.handler.a.e;
import com.meizu.cloud.pushsdk.handler.a.f;
import com.meizu.cloud.pushsdk.handler.c;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class b {
    private static volatile b f;
    Map<String, com.meizu.cloud.pushsdk.handler.a> a;
    public com.meizu.cloud.pushsdk.handler.a.f.a b;
    public com.meizu.cloud.pushsdk.handler.a.a.a c;
    private Context d;
    private final SparseArray<c> e;

    /* loaded from: classes3.dex */
    public class a extends com.meizu.cloud.pushsdk.handler.a {
        public a() {
        }

        @Override // com.meizu.cloud.pushsdk.handler.a
        public final void a(Context context, Intent intent) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, intent);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void a(Context context, MzPushMessage mzPushMessage) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, mzPushMessage);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void a(Context context, PushSwitchStatus pushSwitchStatus) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, pushSwitchStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void a(Context context, RegisterStatus registerStatus) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, registerStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void a(Context context, SubAliasStatus subAliasStatus) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, subAliasStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void a(Context context, SubTagsStatus subTagsStatus) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, subTagsStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void a(Context context, UnRegisterStatus unRegisterStatus) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, unRegisterStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void a(Context context, String str) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, str);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void a(Context context, String str, String str2) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, str, str2);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void a(Context context, boolean z) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, z);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void a(PushNotificationBuilder pushNotificationBuilder) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(pushNotificationBuilder);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void b(Context context, MzPushMessage mzPushMessage) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.b(context, mzPushMessage);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void b(Context context, String str) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.b(context, str);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void c(Context context, MzPushMessage mzPushMessage) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.c(context, mzPushMessage);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public final void c(Context context, String str) {
            for (Map.Entry entry : b.this.a.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.c(context, str);
                }
            }
        }
    }

    private b(Context context) {
        this(context, null);
    }

    private b(Context context, List<c> list) {
        this(context, null, null);
    }

    private b(Context context, List<c> list, com.meizu.cloud.pushsdk.handler.a aVar) {
        this.e = new SparseArray<>();
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        this.d = context.getApplicationContext();
        this.a = new HashMap();
        a aVar2 = new a();
        if (PushConstants.PUSH_PACKAGE_NAME.equalsIgnoreCase(context.getPackageName())) {
            this.b = new com.meizu.cloud.pushsdk.handler.a.f.a(context);
            if (MinSdkChecker.isSupportNotificationSort()) {
                this.c = new com.meizu.cloud.pushsdk.handler.a.a.a(context);
            }
        }
        if (list != null) {
            a(list);
            return;
        }
        a(new com.meizu.cloud.pushsdk.handler.a.c(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.b(context, aVar2));
        a(new e(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.b(context, aVar2));
        a(new d(context, aVar2));
        a(new f(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.d(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.a(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.c(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.f(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.d(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.e(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.f.c(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.b(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.e(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.b.a(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.a(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.f(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.f.b(context, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.c(context, aVar2));
    }

    public static b a(Context context) {
        if (f == null) {
            synchronized (b.class) {
                if (f == null) {
                    DebugLogger.i("PushMessageProxy", "PushMessageProxy init");
                    f = new b(context);
                }
            }
        }
        return f;
    }

    private b a(c cVar) {
        this.e.put(cVar.b(), cVar);
        return this;
    }

    private b a(List<c> list) {
        if (list != null) {
            for (c cVar : list) {
                a(cVar);
            }
            return this;
        }
        throw new IllegalArgumentException("messageManagerList must not be null.");
    }

    public final void a(Intent intent) {
        StringBuilder sb = new StringBuilder("is onMainThread ");
        sb.append(Thread.currentThread() == this.d.getMainLooper().getThread());
        DebugLogger.e("PushMessageProxy", sb.toString());
        try {
            String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "method");
            DebugLogger.i("PushMessageProxy", "receive action " + intent.getAction() + " method " + a2);
            for (int i = 0; i < this.e.size() && !this.e.valueAt(i).e(intent); i++) {
            }
        } catch (Exception e) {
            DebugLogger.e("PushMessageProxy", "processMessage error " + e.getMessage());
        }
    }
}
