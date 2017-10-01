package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.core.TLObject

/**
 * Abstraction level for the following constructors:
 * * [inputPeerChannel#20adaef8][TLInputPeerChannel]
 * * [inputPeerChat#179be863][TLInputPeerChat]
 * * [inputPeerEmpty#7f3b18ea][TLInputPeerEmpty]
 * * [inputPeerSelf#7da07ec9][TLInputPeerSelf]
 * * [inputPeerUser#7b8e7de6][TLInputPeerUser]
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
abstract class TLAbsInputPeer : TLObject()