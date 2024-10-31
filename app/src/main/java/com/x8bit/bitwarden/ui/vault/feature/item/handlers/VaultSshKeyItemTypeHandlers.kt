package com.x8bit.bitwarden.ui.vault.feature.item.handlers

import com.x8bit.bitwarden.ui.vault.feature.item.VaultItemAction
import com.x8bit.bitwarden.ui.vault.feature.item.VaultItemViewModel

/**
 * A collection of handler functions for managing actions within the context of viewing SSH key
 * items in a vault.
 */
data class VaultSshKeyItemTypeHandlers(
    val onShowPrivateKeyClick: (isVisible: Boolean) -> Unit,
) {

    @Suppress("UndocumentedPublicClass")
    companion object {

        /**
         * Creates the [VaultSshKeyItemTypeHandlers] using the [viewModel] to send desired actions.
         */
        @Suppress("LongMethod")
        fun create(viewModel: VaultItemViewModel): VaultSshKeyItemTypeHandlers =
            VaultSshKeyItemTypeHandlers(
                onShowPrivateKeyClick = {
                    viewModel.trySendAction(
                        VaultItemAction.ItemType.SshKey.PrivateKeyVisibilityClicked(
                            isVisible = it,
                        ),
                    )
                },
            )
    }
}