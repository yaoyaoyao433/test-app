package com.dianping.video.videofilter.transcoder.engine;

import android.support.v4.internal.view.SupportMenu;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ShortBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface c {
    public static final c a = new c() { // from class: com.dianping.video.videofilter.transcoder.engine.c.1
        public static ChangeQuickRedirect d;

        @Override // com.dianping.video.videofilter.transcoder.engine.c
        public final void a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
            int i;
            Object[] objArr = {shortBuffer, shortBuffer2};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f7147e72d2572d4663adaadcc166eaf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f7147e72d2572d4663adaadcc166eaf");
                return;
            }
            int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
            for (int i2 = 0; i2 < min; i2++) {
                int i3 = shortBuffer.get() + 32768;
                int i4 = shortBuffer.get() + 32768;
                if (i3 < 32768 || i4 < 32768) {
                    i = (i3 * i4) / 32768;
                } else {
                    i = (((i3 + i4) * 2) - ((i3 * i4) / 32768)) - SupportMenu.USER_MASK;
                }
                if (i == 65536) {
                    i = SupportMenu.USER_MASK;
                }
                shortBuffer2.put((short) (i - 32768));
            }
        }
    };
    public static final c b = new c() { // from class: com.dianping.video.videofilter.transcoder.engine.c.2
        public static ChangeQuickRedirect d;

        @Override // com.dianping.video.videofilter.transcoder.engine.c
        public final void a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
            Object[] objArr = {shortBuffer, shortBuffer2};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "febe0024046774190d27b48579898bf9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "febe0024046774190d27b48579898bf9");
                return;
            }
            int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
            for (int i = 0; i < min; i++) {
                short s = shortBuffer.get();
                shortBuffer2.put(s);
                shortBuffer2.put(s);
            }
        }
    };
    public static final c c = new c() { // from class: com.dianping.video.videofilter.transcoder.engine.c.3
        public static ChangeQuickRedirect d;

        @Override // com.dianping.video.videofilter.transcoder.engine.c
        public final void a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
            Object[] objArr = {shortBuffer, shortBuffer2};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9220965e18089db7cf146b8d25d561c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9220965e18089db7cf146b8d25d561c2");
            } else {
                shortBuffer2.put(shortBuffer);
            }
        }
    };

    void a(ShortBuffer shortBuffer, ShortBuffer shortBuffer2);
}
