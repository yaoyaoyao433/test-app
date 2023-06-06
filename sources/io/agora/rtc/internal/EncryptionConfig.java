package io.agora.rtc.internal;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class EncryptionConfig {
    public EncryptionMode encryptionMode = EncryptionMode.AES_128_XTS;
    public String encryptionKey = null;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum EncryptionMode {
        AES_128_XTS(1),
        AES_128_ECB(2),
        AES_256_XTS(3),
        SM4_128_ECB(4),
        MODE_END(5);
        
        private int value;

        EncryptionMode(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }
}
