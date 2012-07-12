package org.mobicents.protocols.ss7.map.service.mobility.subscriberInformation;

import java.io.IOException;

import org.mobicents.protocols.asn.AsnException;
import org.mobicents.protocols.asn.AsnInputStream;
import org.mobicents.protocols.asn.AsnOutputStream;
import org.mobicents.protocols.asn.Tag;
import org.mobicents.protocols.ss7.map.api.MAPException;
import org.mobicents.protocols.ss7.map.api.MAPParsingComponentException;
import org.mobicents.protocols.ss7.map.api.MAPParsingComponentExceptionReason;
import org.mobicents.protocols.ss7.map.api.primitives.CellGlobalIdOrServiceAreaIdOrLAI;
import org.mobicents.protocols.ss7.map.api.primitives.ISDNAddressString;
import org.mobicents.protocols.ss7.map.api.primitives.MAPExtensionContainer;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.GeodeticInformation;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.GeographicalInformation;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.LocationInformationGPRS;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.RAIdentity;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.LSAIdentity;
import org.mobicents.protocols.ss7.map.primitives.CellGlobalIdOrServiceAreaIdOrLAIImpl;
import org.mobicents.protocols.ss7.map.primitives.ISDNAddressStringImpl;
import org.mobicents.protocols.ss7.map.primitives.MAPAsnPrimitive;
import org.mobicents.protocols.ss7.map.primitives.MAPExtensionContainerImpl;

/**
 * @author amit bhayani
 * 
 */
public class LocationInformationGPRSImpl implements LocationInformationGPRS, MAPAsnPrimitive {

	public static final String _PrimitiveName = "LocationInformationGPRS";

	public static final int _ID_cellGlobalIdOrServiceAreaIdOrLAI = 0;
	private static final int _ID_routeingAreaIdentity = 1;
	private static final int _ID_geographicalInformation = 2;
	private static final int _ID_sgsnNumber = 3;
	private static final int _ID_selectedLSAIdentity = 4;
	private static final int _ID_extensionContainer = 5;
	private static final int _ID_sai_Present = 6;
	private static final int _ID_geodeticInformation = 7;
	private static final int _ID_currentLocationRetrieved = 8;
	private static final int _ID_ageOfLocationInformation = 9;

	private CellGlobalIdOrServiceAreaIdOrLAI cellGlobalIdOrServiceAreaIdOrLAI = null;
	private RAIdentity routeingAreaIdentity = null;
	private GeographicalInformation geographicalInformation = null;
	private ISDNAddressString sgsnNumber = null;
	private LSAIdentity selectedLSAIdentity = null;
	private MAPExtensionContainer extensionContainer = null;
	private Boolean saiPresent = null;
	private GeodeticInformation geodeticInformation = null;
	private Boolean currentLocationRetrieved = null;
	private Integer ageOfLocationInformation = null;

	/**
	 * 
	 */
	public LocationInformationGPRSImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cellGlobalIdOrServiceAreaIdOrLAI
	 * @param routeingAreaIdentity
	 * @param geographicalInformation
	 * @param sgsnNumber
	 * @param selectedLSAIdentity
	 * @param extensionContainer
	 * @param saiPresent
	 * @param geodeticInformation
	 * @param currentLocationRetrieved
	 * @param ageOfLocationInformation
	 */
	public LocationInformationGPRSImpl(CellGlobalIdOrServiceAreaIdOrLAI cellGlobalIdOrServiceAreaIdOrLAI, RAIdentity routeingAreaIdentity,
			GeographicalInformation geographicalInformation, ISDNAddressString sgsnNumber, LSAIdentity selectedLSAIdentity,
			MAPExtensionContainer extensionContainer, Boolean saiPresent, GeodeticInformation geodeticInformation, Boolean currentLocationRetrieved,
			Integer ageOfLocationInformation) {
		super();
		this.cellGlobalIdOrServiceAreaIdOrLAI = cellGlobalIdOrServiceAreaIdOrLAI;
		this.routeingAreaIdentity = routeingAreaIdentity;
		this.geographicalInformation = geographicalInformation;
		this.sgsnNumber = sgsnNumber;
		this.selectedLSAIdentity = selectedLSAIdentity;
		this.extensionContainer = extensionContainer;
		this.saiPresent = saiPresent;
		this.geodeticInformation = geodeticInformation;
		this.currentLocationRetrieved = currentLocationRetrieved;
		this.ageOfLocationInformation = ageOfLocationInformation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mobicents.protocols.ss7.map.api.service.subscriberInformation.
	 * LocationInformationGPRS#getCellGlobalIdOrServiceAreaIdOrLAI()
	 */
	public CellGlobalIdOrServiceAreaIdOrLAI getCellGlobalIdOrServiceAreaIdOrLAI() {
		return this.cellGlobalIdOrServiceAreaIdOrLAI;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mobicents.protocols.ss7.map.api.service.subscriberInformation.
	 * LocationInformationGPRS#getRouteingAreaIdentity()
	 */
	public RAIdentity getRouteingAreaIdentity() {
		return this.routeingAreaIdentity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mobicents.protocols.ss7.map.api.service.subscriberInformation.
	 * LocationInformationGPRS#getGeographicalInformation()
	 */
	public GeographicalInformation getGeographicalInformation() {
		return this.geographicalInformation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mobicents.protocols.ss7.map.api.service.subscriberInformation.
	 * LocationInformationGPRS#getSGSNNumber()
	 */
	public ISDNAddressString getSGSNNumber() {
		return this.sgsnNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mobicents.protocols.ss7.map.api.service.subscriberInformation.
	 * LocationInformationGPRS#getLSAIdentity()
	 */
	public LSAIdentity getLSAIdentity() {
		return this.selectedLSAIdentity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mobicents.protocols.ss7.map.api.service.subscriberInformation.
	 * LocationInformationGPRS#getExtensionContainer()
	 */
	public MAPExtensionContainer getExtensionContainer() {
		return this.extensionContainer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mobicents.protocols.ss7.map.api.service.subscriberInformation.
	 * LocationInformationGPRS#isSaiPresent()
	 */
	public Boolean isSaiPresent() {
		return this.saiPresent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mobicents.protocols.ss7.map.api.service.subscriberInformation.
	 * LocationInformationGPRS#getGeodeticInformation()
	 */
	public GeodeticInformation getGeodeticInformation() {
		return this.geodeticInformation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mobicents.protocols.ss7.map.api.service.subscriberInformation.
	 * LocationInformationGPRS#isCurrentLocationRetrieved()
	 */
	public Boolean isCurrentLocationRetrieved() {
		return this.currentLocationRetrieved;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mobicents.protocols.ss7.map.api.service.subscriberInformation.
	 * LocationInformationGPRS#getAgeOfLocationInformation()
	 */
	public Integer getAgeOfLocationInformation() {
		return this.ageOfLocationInformation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.mobicents.protocols.ss7.map.primitives.MAPAsnPrimitive#getTag()
	 */
	public int getTag() throws MAPException {
		return Tag.SEQUENCE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.map.primitives.MAPAsnPrimitive#getTagClass()
	 */
	public int getTagClass() {
		return Tag.CLASS_UNIVERSAL;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.map.primitives.MAPAsnPrimitive#getIsPrimitive
	 * ()
	 */
	public boolean getIsPrimitive() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.map.primitives.MAPAsnPrimitive#decodeAll(
	 * org.mobicents.protocols.asn.AsnInputStream)
	 */
	public void decodeAll(AsnInputStream ansIS) throws MAPParsingComponentException {
		try {
			int length = ansIS.readLength();
			this._decode(ansIS, length);
		} catch (IOException e) {
			throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
					MAPParsingComponentExceptionReason.MistypedParameter);
		} catch (AsnException e) {
			throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
					MAPParsingComponentExceptionReason.MistypedParameter);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.map.primitives.MAPAsnPrimitive#decodeData
	 * (org.mobicents.protocols.asn.AsnInputStream, int)
	 */
	public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {
		try {
			this._decode(ansIS, length);
		} catch (IOException e) {
			throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
					MAPParsingComponentExceptionReason.MistypedParameter);
		} catch (AsnException e) {
			throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
					MAPParsingComponentExceptionReason.MistypedParameter);
		}
	}

	private void _decode(AsnInputStream ansIS, int length) throws MAPParsingComponentException, IOException, AsnException {

		this.cellGlobalIdOrServiceAreaIdOrLAI = null;
		this.routeingAreaIdentity = null;
		this.geographicalInformation = null;
		this.sgsnNumber = null;
		this.selectedLSAIdentity = null;
		this.extensionContainer = null;
		this.saiPresent = null;
		this.geodeticInformation = null;
		this.currentLocationRetrieved = null;
		this.ageOfLocationInformation = null;

		AsnInputStream ais = ansIS.readSequenceStreamData(length);

		while (true) {
			if (ais.available() == 0)
				break;

			int tag = ais.readTag();

			// optional parameters
			if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC) {

				switch (tag) {
				case _ID_cellGlobalIdOrServiceAreaIdOrLAI:
					this.cellGlobalIdOrServiceAreaIdOrLAI = new CellGlobalIdOrServiceAreaIdOrLAIImpl();
					((CellGlobalIdOrServiceAreaIdOrLAIImpl) this.cellGlobalIdOrServiceAreaIdOrLAI).decodeAll(ais);
					break;
				case _ID_routeingAreaIdentity:
					this.routeingAreaIdentity = new RAIdentityImpl();
					((RAIdentityImpl) this.routeingAreaIdentity).decodeAll(ais);
					break;
				case _ID_geographicalInformation:
					this.geographicalInformation = new GeographicalInformationImpl();
					((GeographicalInformationImpl) this.geographicalInformation).decodeAll(ais);
					break;
				case _ID_sgsnNumber:
					this.sgsnNumber = new ISDNAddressStringImpl();
					((ISDNAddressStringImpl) this.sgsnNumber).decodeAll(ais);
					break;

				case _ID_selectedLSAIdentity:
					this.selectedLSAIdentity = new LSAIdentityImpl();
					((LSAIdentityImpl) this.selectedLSAIdentity).decodeAll(ais);
					break;

				case _ID_extensionContainer:
					this.extensionContainer = new MAPExtensionContainerImpl();
					((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(ais);
					break;
				case _ID_sai_Present:
					if (ais.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ais.isTagPrimitive()) {
						throw new MAPParsingComponentException(
								"Error while decoding LocationInformation: Parameter [sai-Present	[6] NULL ] bad tag class, tag or not primitive",
								MAPParsingComponentExceptionReason.MistypedParameter);
					}
					this.saiPresent = Boolean.TRUE;
					break;

				case _ID_geodeticInformation:
					this.geodeticInformation = new GeodeticInformationImpl();
					((GeodeticInformationImpl) this.geodeticInformation).decodeAll(ais);
					break;
				case _ID_currentLocationRetrieved:
					if (ais.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ais.isTagPrimitive()) {
						throw new MAPParsingComponentException(
								"Error while decoding LocationInformation: Parameter [currentLocationRetrieved	[8] NULL ] bad tag class, tag or not primitive",
								MAPParsingComponentExceptionReason.MistypedParameter);
					}
					this.currentLocationRetrieved = Boolean.TRUE;
					break;
				case _ID_ageOfLocationInformation:
					this.ageOfLocationInformation = (int) ais.readInteger();
					break;
				default:
					ais.advanceElement();
					break;
				}
			} else {
				ais.advanceElement();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.map.primitives.MAPAsnPrimitive#encodeAll(
	 * org.mobicents.protocols.asn.AsnOutputStream)
	 */
	public void encodeAll(AsnOutputStream asnOs) throws MAPException {
		this.encodeAll(asnOs, Tag.CLASS_UNIVERSAL, this.getTag());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.map.primitives.MAPAsnPrimitive#encodeAll(
	 * org.mobicents.protocols.asn.AsnOutputStream, int, int)
	 */
	public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {
		try {
			asnOs.writeTag(tagClass, true, tag);
			int pos = asnOs.StartContentDefiniteLength();
			this.encodeData(asnOs);
			asnOs.FinalizeContent(pos);
		} catch (AsnException e) {
			throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mobicents.protocols.ss7.map.primitives.MAPAsnPrimitive#encodeData
	 * (org.mobicents.protocols.asn.AsnOutputStream)
	 */
	public void encodeData(AsnOutputStream asnOs) throws MAPException {
		try {

			if (this.cellGlobalIdOrServiceAreaIdOrLAI != null)
				((CellGlobalIdOrServiceAreaIdOrLAIImpl) this.cellGlobalIdOrServiceAreaIdOrLAI).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
						_ID_cellGlobalIdOrServiceAreaIdOrLAI);

			if (this.routeingAreaIdentity != null) {
				((RAIdentityImpl) this.routeingAreaIdentity).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _ID_routeingAreaIdentity);
			}

			if (this.geographicalInformation != null)
				((GeographicalInformationImpl) this.geographicalInformation).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _ID_geographicalInformation);

			if (this.sgsnNumber != null)
				((ISDNAddressStringImpl) this.sgsnNumber).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _ID_sgsnNumber);

			if (this.selectedLSAIdentity != null)
				((LSAIdentityImpl) this.selectedLSAIdentity).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _ID_selectedLSAIdentity);

			if (this.extensionContainer != null)
				((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _ID_extensionContainer);

			if (this.saiPresent != null && this.saiPresent) {
				try {
					asnOs.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, _ID_sai_Present);
				} catch (IOException e) {
					throw new MAPException("Error while encoding LocationInformation the optional parameter sai-Present encoding failed ", e);
				} catch (AsnException e) {
					throw new MAPException("Error while encoding LocationInformation the optional parameter sai-Present encoding failed ", e);
				}
			}

			if (this.geodeticInformation != null)
				((GeodeticInformationImpl) this.geodeticInformation).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _ID_geodeticInformation);

			if (this.currentLocationRetrieved != null && this.currentLocationRetrieved) {
				try {
					asnOs.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, _ID_currentLocationRetrieved);
				} catch (IOException e) {
					throw new MAPException("Error while encoding LocationInformation the optional parameter currentLocationRetrieved encoding failed ", e);
				} catch (AsnException e) {
					throw new MAPException("Error while encoding LocationInformation the optional parameter currentLocationRetrieved encoding failed ", e);
				}
			}

			if (ageOfLocationInformation != null)
				asnOs.writeInteger((int) ageOfLocationInformation);

		} catch (IOException e) {
			throw new MAPException("IOException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
		} catch (AsnException e) {
			throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
		}
	}

}
