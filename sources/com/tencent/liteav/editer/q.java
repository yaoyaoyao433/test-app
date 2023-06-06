package com.tencent.liteav.editer;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.videoediter.ffmpeg.jni.TXFFQuickJointerJNI;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class q {
    private static q a;
    private final com.tencent.liteav.c.i b = com.tencent.liteav.c.i.a();

    public static q a() {
        if (a == null) {
            a = new q();
        }
        return a;
    }

    private q() {
    }

    public void b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.b.b() && this.b.c()) {
            File file = new File(com.tencent.liteav.c.i.a().i);
            File file2 = new File(file.getParentFile(), "moov_tmp.mp4");
            if (file2.exists()) {
                file2.delete();
            }
            try {
                file2.createNewFile();
                TXFFQuickJointerJNI tXFFQuickJointerJNI = new TXFFQuickJointerJNI();
                tXFFQuickJointerJNI.setDstPath(file2.getAbsolutePath());
                ArrayList arrayList = new ArrayList();
                arrayList.add(file.getAbsolutePath());
                tXFFQuickJointerJNI.setSrcPaths(arrayList);
                boolean z = tXFFQuickJointerJNI.start() == 0;
                tXFFQuickJointerJNI.stop();
                tXFFQuickJointerJNI.destroy();
                if (!z) {
                    TXCLog.e("MoovHeaderProcessor", "moov: change to moov type video file error!!");
                } else if (!file.delete()) {
                    TXCLog.e("MoovHeaderProcessor", "moov: delete original file error!");
                } else {
                    boolean renameTo = file2.renameTo(file);
                    TXCLog.i("MoovHeaderProcessor", "moov: rename file success = " + renameTo);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    TXCLog.d("MoovHeaderProcessor", "doProcessMoovHeader cost time:" + String.valueOf(currentTimeMillis2 - currentTimeMillis));
                }
            } catch (IOException e) {
                e.printStackTrace();
                TXCLog.e("MoovHeaderProcessor", "moov: create moov tmp file error!");
            }
        }
    }
}
