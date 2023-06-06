package com.dianping.video.recorder.model;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Parcel;
import android.os.Parcelable;
import com.dianping.video.log.c;
import com.dianping.video.model.Frame;
import com.dianping.video.recorder.manager.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@TargetApi(18)
/* loaded from: classes.dex */
public class RecordSession implements Parcelable {
    public static final Parcelable.Creator<RecordSession> CREATOR = new Parcelable.Creator<RecordSession>() { // from class: com.dianping.video.recorder.model.RecordSession.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RecordSession createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ba6b261beac62910f6e3a1aad0331c8", RobustBitConfig.DEFAULT_VALUE) ? (RecordSession) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ba6b261beac62910f6e3a1aad0331c8") : new RecordSession(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RecordSession[] newArray(int i) {
            return new RecordSession[i];
        }
    };
    public static ChangeQuickRedirect a;
    private boolean b;
    private int c;
    private byte[] d;
    private List<Frame> e;
    private String f;
    private MediaFormatInfo g;
    private File h;
    private FileOutputStream i;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RecordSession(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7f8b3de3892f43b82ca0b94065abad0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7f8b3de3892f43b82ca0b94065abad0");
            return;
        }
        this.g = new MediaFormatInfo();
        this.f = str;
        this.e = new ArrayList();
        b();
    }

    private void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f70c97b83478483290b977134c48b73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f70c97b83478483290b977134c48b73");
            return;
        }
        this.h = new File(this.f);
        if (this.h.exists()) {
            return;
        }
        try {
            z = this.h.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (z) {
            return;
        }
        c.a().a(RecordSession.class, "target frame file creation failed");
    }

    public RecordSession(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c52f54f7a8774a35baea32674735563a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c52f54f7a8774a35baea32674735563a");
            return;
        }
        this.g = new MediaFormatInfo();
        this.c = parcel.readInt();
        this.e = parcel.createTypedArrayList(Frame.CREATOR);
        this.f = parcel.readString();
        this.g = (MediaFormatInfo) parcel.readParcelable(MediaFormatInfo.class.getClassLoader());
    }

    public final boolean a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        Object[] objArr = {byteBuffer, bufferInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec8eb12e1e53ae171be364ab563815c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec8eb12e1e53ae171be364ab563815c6")).booleanValue();
        }
        if (!this.b) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ad0b7b385b690fd2e1791696d558190", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ad0b7b385b690fd2e1791696d558190");
            } else {
                try {
                    if (this.h == null) {
                        b();
                    }
                    this.i = new FileOutputStream(this.h);
                    this.b = true;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        c a2 = c.a();
        a2.a("RecordSession", "frameType = " + i + " ; bufferInfo = " + a.a(bufferInfo));
        Frame frame = new Frame();
        frame.h = this.h.length();
        frame.i = this.f;
        frame.d = bufferInfo.offset;
        frame.e = bufferInfo.offset + bufferInfo.size;
        frame.g = bufferInfo.presentationTimeUs;
        frame.c = i;
        frame.f = bufferInfo.flags;
        if (this.d == null) {
            this.d = new byte[byteBuffer.capacity()];
        }
        byteBuffer.get(this.d, 0, bufferInfo.size);
        try {
            this.i.write(this.d, 0, bufferInfo.size);
            this.e.add(frame);
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            c.a().a(a.class, com.dianping.util.exception.a.a(e2));
            return false;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b70fa33475466b959d777e13a7b402c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b70fa33475466b959d777e13a7b402c");
            return;
        }
        try {
            this.i.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.i.close();
            this.b = false;
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        this.d = null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5106109e96d945183c9645f243753f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5106109e96d945183c9645f243753f30");
            return;
        }
        parcel.writeInt(101);
        parcel.writeTypedList(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
    }
}
