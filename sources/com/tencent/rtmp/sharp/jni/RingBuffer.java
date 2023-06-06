package com.tencent.rtmp.sharp.jni;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RingBuffer {
    private final int DEFAULT_SIZE = 1000;
    public int c_totalSize;
    public boolean m_isEmpty;
    public byte[] m_pBuf;
    public int m_read;
    public int m_write;

    public RingBuffer() {
        this.c_totalSize = 1000;
        this.m_read = 0;
        this.m_write = 0;
        this.m_isEmpty = true;
        this.m_pBuf = null;
        this.c_totalSize = 1000;
        this.m_isEmpty = true;
        this.m_read = 0;
        this.m_write = 0;
        this.m_pBuf = new byte[this.c_totalSize];
    }

    public RingBuffer(int i) {
        this.c_totalSize = 1000;
        this.m_read = 0;
        this.m_write = 0;
        this.m_isEmpty = true;
        this.c_totalSize = i;
        this.m_isEmpty = true;
        this.m_read = 0;
        this.m_write = 0;
        this.m_pBuf = new byte[this.c_totalSize];
    }

    public void Push(byte[] bArr, int i) {
        if (this.m_pBuf != null && RemainWrite() >= i) {
            if (this.c_totalSize - this.m_write >= i) {
                System.arraycopy(bArr, 0, this.m_pBuf, this.m_write, i);
            } else {
                System.arraycopy(bArr, 0, this.m_pBuf, this.m_write, this.c_totalSize - this.m_write);
                System.arraycopy(bArr, this.c_totalSize - this.m_write, this.m_pBuf, 0, i - (this.c_totalSize - this.m_write));
            }
            this.m_write = (this.m_write + i) % this.c_totalSize;
            this.m_isEmpty = false;
        }
    }

    public int RemainRead() {
        if (this.m_write < this.m_read) {
            return (this.c_totalSize - this.m_read) + this.m_write;
        }
        if (this.m_write > this.m_read) {
            return this.m_write - this.m_read;
        }
        if (this.m_isEmpty) {
            return 0;
        }
        return this.c_totalSize;
    }

    public int RemainWrite() {
        return this.c_totalSize - RemainRead();
    }

    public void Clear() {
        this.m_write = 0;
        this.m_read = this.m_write;
        this.m_isEmpty = true;
    }

    public boolean Pop(byte[] bArr, int i) {
        if (this.m_pBuf != null && RemainRead() >= i && i > 0) {
            if (this.c_totalSize - this.m_read >= i) {
                System.arraycopy(this.m_pBuf, this.m_read, bArr, 0, i);
            } else {
                System.arraycopy(this.m_pBuf, this.m_read, bArr, 0, this.c_totalSize - this.m_read);
                System.arraycopy(this.m_pBuf, 0, bArr, this.c_totalSize - this.m_read, i - (this.c_totalSize - this.m_read));
            }
            this.m_read = (this.m_read + i) % this.c_totalSize;
            this.m_isEmpty = this.m_read == this.m_write;
            return true;
        }
        return false;
    }
}
