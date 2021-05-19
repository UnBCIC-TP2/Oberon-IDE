/**
 * generated by Xtext 2.25.0
 */
package br.unb.cic.obron.ide.oberon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.obron.ide.oberon.Procedure#getName <em>Name</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.Procedure#getFormals <em>Formals</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.Procedure#getProcedureType <em>Procedure Type</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.Procedure#getDecl <em>Decl</em>}</li>
 *   <li>{@link br.unb.cic.obron.ide.oberon.Procedure#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.obron.ide.oberon.OberonPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.unb.cic.obron.ide.oberon.OberonPackage#getProcedure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.unb.cic.obron.ide.oberon.Procedure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Formals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formals</em>' containment reference.
   * @see #setFormals(Formals)
   * @see br.unb.cic.obron.ide.oberon.OberonPackage#getProcedure_Formals()
   * @model containment="true"
   * @generated
   */
  Formals getFormals();

  /**
   * Sets the value of the '{@link br.unb.cic.obron.ide.oberon.Procedure#getFormals <em>Formals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formals</em>' containment reference.
   * @see #getFormals()
   * @generated
   */
  void setFormals(Formals value);

  /**
   * Returns the value of the '<em><b>Procedure Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure Type</em>' containment reference.
   * @see #setProcedureType(OberonType)
   * @see br.unb.cic.obron.ide.oberon.OberonPackage#getProcedure_ProcedureType()
   * @model containment="true"
   * @generated
   */
  OberonType getProcedureType();

  /**
   * Sets the value of the '{@link br.unb.cic.obron.ide.oberon.Procedure#getProcedureType <em>Procedure Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure Type</em>' containment reference.
   * @see #getProcedureType()
   * @generated
   */
  void setProcedureType(OberonType value);

  /**
   * Returns the value of the '<em><b>Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' containment reference.
   * @see #setDecl(Declarations)
   * @see br.unb.cic.obron.ide.oberon.OberonPackage#getProcedure_Decl()
   * @model containment="true"
   * @generated
   */
  Declarations getDecl();

  /**
   * Sets the value of the '{@link br.unb.cic.obron.ide.oberon.Procedure#getDecl <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decl</em>' containment reference.
   * @see #getDecl()
   * @generated
   */
  void setDecl(Declarations value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see br.unb.cic.obron.ide.oberon.OberonPackage#getProcedure_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link br.unb.cic.obron.ide.oberon.Procedure#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // Procedure