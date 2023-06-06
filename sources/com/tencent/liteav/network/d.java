package com.tencent.liteav.network;

import android.os.Bundle;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d implements h {
    private a f;
    private h a = null;
    private b b = null;
    private long c = 0;
    private long d = 0;
    private b e = null;
    private long g = 0;
    private long h = 0;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void onSwitchFinish(TXIStreamDownloader tXIStreamDownloader, boolean z);
    }

    public void a(h hVar) {
        this.a = hVar;
    }

    public d(a aVar) {
        this.f = aVar;
    }

    public void a() {
        if (this.b != null) {
            this.b.b(0L);
        }
        if (this.e != null) {
            this.e.b(0L);
        }
    }

    public void a(TXIStreamDownloader tXIStreamDownloader, TXIStreamDownloader tXIStreamDownloader2, long j, long j2, String str) {
        this.c = tXIStreamDownloader.getCurrentTS();
        this.d = tXIStreamDownloader.getLastIFrameTS();
        this.b = new b(tXIStreamDownloader, this);
        this.b.a(this);
        ((TXCFLVDownloader) tXIStreamDownloader).recvData(true);
        Vector<e> vector = new Vector<>();
        vector.add(new e(str, false));
        tXIStreamDownloader2.setOriginUrl(str);
        ((TXCFLVDownloader) tXIStreamDownloader2).recvData(true);
        tXIStreamDownloader2.startDownload(vector, false, false, tXIStreamDownloader.mEnableMessage, tXIStreamDownloader.mEnableMetaData);
        this.e = new b(tXIStreamDownloader2, this);
        this.e.a(this.c);
    }

    public void b() {
        long j;
        long j2;
        this.b.a((h) null);
        this.e.a(this);
        this.b = this.e;
        this.e = null;
        StringBuilder sb = new StringBuilder(" stream_switch end at ");
        sb.append(this.c);
        sb.append(" stop ts ");
        sb.append(this.h);
        sb.append(" start ts ");
        sb.append(this.g);
        sb.append(" diff ts ");
        if (this.h > this.g) {
            j = this.h;
            j2 = this.g;
        } else {
            j = this.g;
            j2 = this.h;
        }
        sb.append(j - j2);
        TXCLog.w("TXCMultiStreamDownloader", sb.toString());
    }

    void a(TXIStreamDownloader tXIStreamDownloader, boolean z) {
        if (this.f != null) {
            this.f.onSwitchFinish(tXIStreamDownloader, z);
        }
    }

    long a(long j) {
        if (this.b != null) {
            this.b.b(this.c);
        }
        TXCLog.w("TXCMultiStreamDownloader", " stream_switch delay stop begin from " + this.c);
        return this.c;
    }

    void b(long j) {
        this.g = j;
    }

    void c(long j) {
        this.h = j;
    }

    @Override // com.tencent.liteav.network.h
    public void onPullAudio(com.tencent.liteav.basic.structs.a aVar) {
        if (this.a != null) {
            this.a.onPullAudio(aVar);
        }
    }

    @Override // com.tencent.liteav.network.h
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        this.c = tXSNALPacket.pts;
        if (tXSNALPacket.nalType == 0) {
            this.d = tXSNALPacket.pts;
        }
        if (this.a != null) {
            this.a.onPullNAL(tXSNALPacket);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b implements com.tencent.liteav.basic.c.b, h {
        private final int a = 2;
        private long b = 0;
        private long c = 0;
        private int d = 0;
        private boolean e = false;
        private long f = 0;
        private long g = 0;
        private long h = 0;
        private ArrayList<TXSNALPacket> i = new ArrayList<>();
        private ArrayList<com.tencent.liteav.basic.structs.a> j = new ArrayList<>();
        private TXIStreamDownloader k;
        private WeakReference<d> l;
        private h m;

        public b(TXIStreamDownloader tXIStreamDownloader, d dVar) {
            this.k = null;
            this.l = new WeakReference<>(dVar);
            this.k = tXIStreamDownloader;
            this.k.setListener(this);
        }

        public void a(long j) {
            this.d = 0;
            this.b = j;
            this.k.setListener(this);
            this.k.setNotifyListener(this);
        }

        public void b(long j) {
            this.b = 0L;
            this.f = j;
            this.h = 0L;
            this.g = 0L;
            if (this.k == null || this.f != 0) {
                return;
            }
            this.k.stopDownload();
            this.k = null;
        }

        public void a(h hVar) {
            this.m = hVar;
        }

        @Override // com.tencent.liteav.network.h
        public void onPullAudio(com.tencent.liteav.basic.structs.a aVar) {
            if (this.b > 0) {
                a(aVar);
            } else if (this.f > 0) {
                b(aVar);
            } else if (this.m != null) {
                this.m.onPullAudio(aVar);
            }
        }

        @Override // com.tencent.liteav.network.h
        public void onPullNAL(TXSNALPacket tXSNALPacket) {
            if (tXSNALPacket == null) {
                return;
            }
            if (this.b > 0) {
                a(tXSNALPacket);
            } else if (this.f > 0) {
                b(tXSNALPacket);
            } else if (this.m != null) {
                this.m.onPullNAL(tXSNALPacket);
            }
        }

        private void a(com.tencent.liteav.basic.structs.a aVar) {
            if (aVar != null && aVar.timestamp >= this.c && aVar.timestamp >= this.b) {
                if (this.m != null && this.c > 0 && aVar.timestamp >= this.c) {
                    this.m.onPullAudio(aVar);
                } else {
                    this.j.add(aVar);
                }
            }
        }

        private void b(com.tencent.liteav.basic.structs.a aVar) {
            if (this.h > 0) {
                return;
            }
            if (this.g > 0 && aVar != null && aVar.timestamp >= this.g) {
                this.h = aVar.timestamp;
            } else if (this.m != null) {
                this.m.onPullAudio(aVar);
            }
        }

        private void a(TXSNALPacket tXSNALPacket) {
            d dVar = this.l.get();
            if (tXSNALPacket.nalType == 0 && !this.e) {
                this.d++;
                if (dVar != null && (dVar.d <= tXSNALPacket.pts || this.d == 2)) {
                    this.b = dVar.a(tXSNALPacket.pts);
                    this.e = true;
                }
                if (dVar != null) {
                    TXCLog.w("TXCMultiStreamDownloader", " stream_switch pre start begin gop " + this.d + " last iframe ts " + dVar.d + " pts " + tXSNALPacket.pts + " from " + this.b + " type " + tXSNALPacket.nalType);
                }
            }
            if (this.e) {
                if (dVar != null) {
                    dVar.b(tXSNALPacket.pts);
                }
                if (tXSNALPacket.pts >= this.b) {
                    if (tXSNALPacket.nalType == 0 && this.c == 0) {
                        this.c = tXSNALPacket.pts;
                        TXCLog.w("TXCMultiStreamDownloader", " stream_switch pre start end " + tXSNALPacket.pts + " from " + this.b + " type " + tXSNALPacket.nalType);
                    }
                    if (this.c > 0) {
                        if (this.m != null) {
                            if (dVar != null) {
                                dVar.a(this.k, true);
                            }
                            if (!this.j.isEmpty()) {
                                Iterator<com.tencent.liteav.basic.structs.a> it = this.j.iterator();
                                while (it.hasNext()) {
                                    com.tencent.liteav.basic.structs.a next = it.next();
                                    if (next.timestamp >= this.c) {
                                        TXCLog.i("TXCMultiStreamDownloader", " stream_switch pre start cache audio pts " + next.timestamp + " from " + this.c);
                                        this.m.onPullAudio(next);
                                    }
                                }
                                TXCLog.w("TXCMultiStreamDownloader", " stream_switch pre start end audio cache  " + this.j.size());
                                this.j.clear();
                            }
                            if (!this.i.isEmpty()) {
                                TXCLog.w("TXCMultiStreamDownloader", " stream_switch pre start end video cache  " + this.i.size());
                                Iterator<TXSNALPacket> it2 = this.i.iterator();
                                while (it2.hasNext()) {
                                    this.m.onPullNAL(it2.next());
                                }
                                this.i.clear();
                            }
                            TXCLog.w("TXCMultiStreamDownloader", " stream_switch pre start first pull nal " + tXSNALPacket.pts + " from " + this.c + " type " + tXSNALPacket.nalType);
                            this.m.onPullNAL(tXSNALPacket);
                            this.m = null;
                            this.k.setNotifyListener(null);
                            return;
                        }
                        TXCLog.i("TXCMultiStreamDownloader", " stream_switch pre start cache video pts " + tXSNALPacket.pts + " from " + this.c + " type " + tXSNALPacket.nalType);
                        this.i.add(tXSNALPacket);
                    }
                }
            }
        }

        private void b(TXSNALPacket tXSNALPacket) {
            d dVar = this.l.get();
            if (dVar != null) {
                dVar.c(tXSNALPacket.pts);
            }
            if (tXSNALPacket.pts >= this.f) {
                if (tXSNALPacket.nalType == 0) {
                    this.g = tXSNALPacket.pts;
                }
                if (this.g > 0) {
                    if (this.h > 0) {
                        TXCLog.w("TXCMultiStreamDownloader", " stream_switch delay stop end video pts " + this.g + " audio ts " + this.h + " from " + this.f);
                        if (dVar != null) {
                            dVar.b();
                        }
                        this.m = null;
                        this.k.setListener(null);
                        this.k.stopDownload();
                        return;
                    }
                    TXCLog.w("TXCMultiStreamDownloader", " stream_switch delay stop video end wait audio end video pts " + tXSNALPacket.pts + " from " + this.f + " type " + tXSNALPacket.nalType);
                } else if (this.m != null) {
                    this.m.onPullNAL(tXSNALPacket);
                }
            } else if (this.m != null) {
                this.m.onPullNAL(tXSNALPacket);
            }
        }

        @Override // com.tencent.liteav.basic.c.b
        public void onNotifyEvent(int i, Bundle bundle) {
            if (i == -2301 || i == 3010) {
                d dVar = this.l.get();
                if (dVar != null) {
                    dVar.a(this.k, false);
                }
                this.k.setNotifyListener(null);
            }
        }
    }
}
