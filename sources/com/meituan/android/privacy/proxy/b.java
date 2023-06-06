package com.meituan.android.privacy.proxy;

import android.media.AudioRecord;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.proxy.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.android.privacy.interfaces.j {
    public static ChangeQuickRedirect a;
    AudioRecord b;
    private u c;
    private String d;

    public b(@NonNull String str, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "862da566ce8852a77c863506baa6cc4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "862da566ce8852a77c863506baa6cc4e");
            return;
        }
        this.b = null;
        this.d = str;
        this.c = new u();
        if (z.a(PermissionGuard.PERMISSION_MICROPHONE, str, z.b)) {
            this.b = new AudioRecord(i, i2, i3, i4, i5);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final void a() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c8faeac98ddf517892ddc86535270d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c8faeac98ddf517892ddc86535270d");
        } else if (this.b != null) {
            this.c.a("ad.startRecording", this.d, new String[]{PermissionGuard.PERMISSION_MICROPHONE}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c38d819f5c489970c2a1c9440d6c705b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c38d819f5c489970c2a1c9440d6c705b");
                    }
                    b.this.b.startRecording();
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final void b() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e0d08d5ad5a60dfb707d24e6bb37ac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e0d08d5ad5a60dfb707d24e6bb37ac9");
        } else if (this.b != null) {
            this.c.a("ad.stop", this.d, new String[]{PermissionGuard.PERMISSION_MICROPHONE}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.b.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29c1ff58c5645292715494ed2dd73d20", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29c1ff58c5645292715494ed2dd73d20");
                    }
                    b.this.b.stop();
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5df424e26c1adaad2f0dfb62aab7cd6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5df424e26c1adaad2f0dfb62aab7cd6a");
        } else if (this.b != null) {
            this.b.release();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc632a7bb9847ee543111568feae6bba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc632a7bb9847ee543111568feae6bba")).intValue();
        }
        if (this.b != null) {
            return this.b.getState();
        }
        return 0;
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ed22ae1ac72bc3ee9e7a7a124727249", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ed22ae1ac72bc3ee9e7a7a124727249")).intValue();
        }
        if (this.b != null) {
            return this.b.getAudioSessionId();
        }
        return 0;
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "072ab7a60a3a7925c47a2072067c8fa2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "072ab7a60a3a7925c47a2072067c8fa2")).intValue();
        }
        if (this.b != null) {
            return this.b.getRecordingState();
        }
        return 0;
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final int a(final byte[] bArr, int i, final int i2) {
        Integer num;
        Object[] objArr = {bArr, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d990a7e200d7a664108677e4256d1f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d990a7e200d7a664108677e4256d1f8")).intValue();
        }
        if (this.b == null || (num = (Integer) this.c.a("ad.read", this.d, new String[]{PermissionGuard.PERMISSION_MICROPHONE}, new u.a<Integer>() { // from class: com.meituan.android.privacy.proxy.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Integer a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12fb9827f08bade79b3b6ec2e3fb0ca8", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12fb9827f08bade79b3b6ec2e3fb0ca8") : Integer.valueOf(b.this.b.read(bArr, r3, i2));
            }
        }, false)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final int a(@NonNull final short[] sArr, final int i, final int i2) {
        Integer num;
        Object[] objArr = {sArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627f7b7bb638e199cc9bded9ee47ca0f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627f7b7bb638e199cc9bded9ee47ca0f")).intValue();
        }
        if (this.b == null || (num = (Integer) this.c.a("ad.read", this.d, new String[]{PermissionGuard.PERMISSION_MICROPHONE}, new u.a<Integer>() { // from class: com.meituan.android.privacy.proxy.b.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Integer a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5126e88c341567b6391fd244e08bfb4", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5126e88c341567b6391fd244e08bfb4") : Integer.valueOf(b.this.b.read(sArr, i, i2));
            }
        }, false)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
