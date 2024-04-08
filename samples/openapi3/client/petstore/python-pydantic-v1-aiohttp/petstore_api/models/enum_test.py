# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    The version of the OpenAPI document: 1.0.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, Field, StrictInt, StrictStr, validator
from petstore_api.models.outer_enum import OuterEnum
from petstore_api.models.outer_enum_default_value import OuterEnumDefaultValue
from petstore_api.models.outer_enum_integer import OuterEnumInteger
from petstore_api.models.outer_enum_integer_default_value import OuterEnumIntegerDefaultValue

class EnumTest(BaseModel):
    """
    EnumTest
    """
    enum_string: Optional[StrictStr] = None
    enum_string_required: StrictStr = Field(...)
    enum_integer_default: Optional[StrictInt] = 5
    enum_integer: Optional[StrictInt] = None
    enum_number: Optional[float] = None
    outer_enum: Optional[OuterEnum] = Field(default=None, alias="outerEnum")
    outer_enum_integer: Optional[OuterEnumInteger] = Field(default=None, alias="outerEnumInteger")
    outer_enum_default_value: Optional[OuterEnumDefaultValue] = Field(default=None, alias="outerEnumDefaultValue")
    outer_enum_integer_default_value: Optional[OuterEnumIntegerDefaultValue] = Field(default=None, alias="outerEnumIntegerDefaultValue")
    __properties = ["enum_string", "enum_string_required", "enum_integer_default", "enum_integer", "enum_number", "outerEnum", "outerEnumInteger", "outerEnumDefaultValue", "outerEnumIntegerDefaultValue"]

    @validator('enum_string')
    def enum_string_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('UPPER', 'lower', ''):
            raise ValueError("must be one of enum values ('UPPER', 'lower', '')")
        return value

    @validator('enum_string_required')
    def enum_string_required_validate_enum(cls, value):
        """Validates the enum"""
        if value not in ('UPPER', 'lower', ''):
            raise ValueError("must be one of enum values ('UPPER', 'lower', '')")
        return value

    @validator('enum_integer_default')
    def enum_integer_default_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in (1, 5, 14):
            raise ValueError("must be one of enum values (1, 5, 14)")
        return value

    @validator('enum_integer')
    def enum_integer_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in (1, -1):
            raise ValueError("must be one of enum values (1, -1)")
        return value

    @validator('enum_number')
    def enum_number_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in (1.1, -1.2):
            raise ValueError("must be one of enum values (1.1, -1.2)")
        return value

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> EnumTest:
        """Create an instance of EnumTest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # set to None if outer_enum (nullable) is None
        # and __fields_set__ contains the field
        if self.outer_enum is None and "outer_enum" in self.__fields_set__:
            _dict['outerEnum'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> EnumTest:
        """Create an instance of EnumTest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return EnumTest.parse_obj(obj)

        _obj = EnumTest.parse_obj({
            "enum_string": obj.get("enum_string"),
            "enum_string_required": obj.get("enum_string_required"),
            "enum_integer_default": obj.get("enum_integer_default") if obj.get("enum_integer_default") is not None else 5,
            "enum_integer": obj.get("enum_integer"),
            "enum_number": obj.get("enum_number"),
            "outer_enum": obj.get("outerEnum"),
            "outer_enum_integer": obj.get("outerEnumInteger"),
            "outer_enum_default_value": obj.get("outerEnumDefaultValue"),
            "outer_enum_integer_default_value": obj.get("outerEnumIntegerDefaultValue")
        })
        return _obj


